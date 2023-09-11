package com.ssd.matches.payload;

import java.util.List;

public class PageningAndSortingResponse {

	private List<MatchesDto> matchesDtoList;
	private Integer pageNo;
	private Integer pageSize;
	private Long totalElements;
	private Integer totalPages;
	private Integer last;
	public PageningAndSortingResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PageningAndSortingResponse(List<MatchesDto> matchesDtoList, Integer pageNo, Integer pageSize,
			Long totalElements, Integer totalPages, Integer last) {
		super();
		this.matchesDtoList = matchesDtoList;
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.totalElements = totalElements;
		this.totalPages = totalPages;
		this.last = last;
	}
	@Override
	public String toString() {
		return "PageningAndSortingResponse [matchesDtoList=" + matchesDtoList + ", pageNo=" + pageNo + ", pageSize="
				+ pageSize + ", totalElements=" + totalElements + ", totalPages=" + totalPages + ", last=" + last + "]";
	}
	public List<MatchesDto> getMatchesDtoList() {
		return matchesDtoList;
	}
	public void setMatchesDtoList(List<MatchesDto> matchesDtoList) {
		this.matchesDtoList = matchesDtoList;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	public Integer getLast() {
		return last;
	}
	public void setLast(Integer last) {
		this.last = last;
	}
	
	
}
