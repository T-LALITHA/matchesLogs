package com.ssd.matches.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.matches.payload.MatchesDto;
import com.ssd.matches.payload.PageningAndSortingResponse;
import com.ssd.matches.serviceImpl.ErrorMessageGeneratorServiceImpl;
import com.ssd.matches.serviceImpl.MatchesServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class MatchesRestController {
	
	@Autowired
	private MatchesServiceImpl matchesServiceImpl;
	
	@Autowired
	private ErrorMessageGeneratorServiceImpl emgs;
	
	private static final Logger logger = LoggerFactory.getLogger(MatchesRestController.class);

	@PutMapping("/matches")
	public ResponseEntity<?> saveMatches(@Valid @RequestBody MatchesDto matchesDto ,BindingResult errors){
		
		logger.trace("trace level ");
		
		logger.debug(" debug level");
		
		logger.info("info level");
		
		logger.warn("warn level");
		
		logger.error("error level");
		
		if (errors.hasErrors()) {
			
			return emgs.getErrorMsg(errors);
			
		} else {

			return new ResponseEntity<MatchesDto>(matchesServiceImpl.saveMatches(matchesDto), HttpStatus.CREATED);
		}
		
		
	}
	
	@GetMapping("/matches")
	public ResponseEntity<PageningAndSortingResponse> getAllMatches(
			@RequestParam(value = "pageNo" , defaultValue = "0" , required = false ) int pageNo,
			@RequestParam(value = "pageSize" , defaultValue = "10" , required = false) int pageSize,
			@RequestParam(value = "sortBy" , defaultValue = "id" , required = false) String sortBy,
			@RequestParam(value = "sortDir" ,defaultValue = "ASC" , required = false) String sortDir){
		PageningAndSortingResponse psar = matchesServiceImpl.getAllMatches(pageNo,pageSize,sortBy,sortDir);
		return new ResponseEntity<PageningAndSortingResponse>(psar,HttpStatus.OK);
	
	}
	
	@GetMapping("/matches/{id}")
	public ResponseEntity<MatchesDto> getMatchById(@PathVariable Integer id){
		return new ResponseEntity<MatchesDto>(matchesServiceImpl.getMatchById(id), HttpStatus.OK);
		
	}
}
