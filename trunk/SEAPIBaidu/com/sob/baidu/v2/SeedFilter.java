/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.SeedFilter.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-25 ÏÂÎç3:57:46
 * 
 */
public class SeedFilter {
	public List duplicateUIds;
	public Boolean removeDuplicate;
	public Integer monthFilter;
	public Boolean hotMonth;
	public Integer maxNum;
	public Boolean regionExtend;
	public List searchRegion;
	public Long competeHigh;
	public Long competeLow;
	public Long pvHigh;
	public Long pvLow;
	public List negativeWord;
	public Integer matchType;

	public SeedFilter() {
	}

	public List getDuplicateUIds() {
		return duplicateUIds;
	}

	public void setDuplicateUIds(List value) {
		duplicateUIds = value;
	}

	public Boolean getRemoveDuplicate() {
		return removeDuplicate;
	}

	public void setRemoveDuplicate(Boolean value) {
		removeDuplicate = value;
	}

	public Integer getMonthFilter() {
		return monthFilter;
	}

	public void setMonthFilter(Integer value) {
		monthFilter = value;
	}

	public Boolean getHotMonth() {
		return hotMonth;
	}

	public void setHotMonth(Boolean value) {
		hotMonth = value;
	}

	public Integer getMaxNum() {
		return maxNum;
	}

	public void setMaxNum(Integer value) {
		maxNum = value;
	}

	public Boolean getRegionExtend() {
		return regionExtend;
	}

	public void setRegionExtend(Boolean value) {
		regionExtend = value;
	}

	public List getSearchRegion() {
		return searchRegion;
	}

	public void setSearchRegion(List value) {
		searchRegion = value;
	}

	public Long getCompeteHigh() {
		return competeHigh;
	}

	public void setCompeteHigh(Long value) {
		competeHigh = value;
	}

	public Long getCompeteLow() {
		return competeLow;
	}

	public void setCompeteLow(Long value) {
		competeLow = value;
	}

	public Long getPvHigh() {
		return pvHigh;
	}

	public void setPvHigh(Long value) {
		pvHigh = value;
	}

	public Long getPvLow() {
		return pvLow;
	}

	public void setPvLow(Long value) {
		pvLow = value;
	}

	public List getNegativeWord() {
		return negativeWord;
	}

	public void setNegativeWord(List value) {
		negativeWord = value;
	}

	public Integer getMatchType() {
		return matchType;
	}

	public void setMatchType(Integer value) {
		matchType = value;
	}
}
