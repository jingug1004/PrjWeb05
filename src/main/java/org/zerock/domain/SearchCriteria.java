package org.zerock.domain;

/**
 * Created by macbookpro on 2017. 2. 12. PM 12:45
 * sp4chap11-Project / org.zerock.domain
 * No pain, No gain!
 */


public class SearchCriteria extends Criteria{

    private String searchType;
    private String keyword;

    public String getSearchType() {
        return searchType;
    }
    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }
    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    @Override
    public String toString() {
        return super.toString() + " SearchCriteria "
                + "[searchType=" + searchType + ", keyword="
                + keyword + "]";
    }
}
