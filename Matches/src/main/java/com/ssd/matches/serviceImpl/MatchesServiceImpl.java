package com.ssd.matches.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ssd.matches.model.Matches;
import com.ssd.matches.payload.MatchesDto;
import com.ssd.matches.payload.PageningAndSortingResponse;
import com.ssd.matches.repository.MatchesRepository;
import com.ssd.matches.web.MatchesRestController;

import jakarta.validation.Valid;

@Service
public class MatchesServiceImpl {

	@Autowired
	private MatchesRepository matchesRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private static final Logger logger = LoggerFactory.getLogger(MatchesServiceImpl.class);


	public PageningAndSortingResponse getAllMatches(int pageNo, int pageSize, String sortBy, String sortDir) {
		
		List<MatchesDto> matchesDtoList = new ArrayList<>();
	
		Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())
				? Sort.by(sortBy).ascending() 
						: Sort.by(sortBy).descending() ;
		
		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
		Page<Matches> pages = matchesRepository.findAll(pageable);
		
        for (Matches matches : pages) {
			
			MatchesDto dto =  this.modelMapper.map(matches, MatchesDto.class);
			
			matchesDtoList.add(dto);
		}
		
        PageningAndSortingResponse pasr = new PageningAndSortingResponse();
        
        pasr.setMatchesDtoList(matchesDtoList);
        pasr.setPageNo(pages.getNumber());
        pasr.setPageSize(pages.getSize());
        pasr.setTotalPages(pages.getTotalPages());
        pasr.setTotalElements(pages.getTotalElements());
        pasr.setLast(pages.getTotalPages()-1);
        
		
		return pasr;
	}

	public MatchesDto saveMatches(MatchesDto matchesDto) {
		
      
		try {
        System.out.println(10/0);
		}catch (Exception e) {

			logger.error("arithmatic exception occured");
			
			}
		
		
		Matches matches = this.modelMapper.map(matchesDto, Matches.class);
		matches = matchesRepository.save(matches);
		matchesDto = this.modelMapper.map(matches, MatchesDto.class);
		
		return matchesDto;
	}

	public MatchesDto getMatchById(Integer id) {
		
		Matches matches = matchesRepository.findById(id).orElse(null);
		MatchesDto matchesDto = this.modelMapper.map(matches, MatchesDto.class);
		
		return matchesDto;
	}
}
