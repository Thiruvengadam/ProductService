package com.jlp.product;

import java.util.List;

public class Response{
	private String redirectUrl;
	private String selectedDept;
	private String categoryTitle;
	private int childCategoriesCount;
	private List<ProductsItem> products;
	private List<FacetsItem> facets;
	private List<Object> staticLinks;
	private List<CrumbsItem> crumbs;
	private String endecaCanonical;
	private SeoInformation seoInformation;
	private int pagesAvailable;
	private String multiCatSelected;
	private String seoBannerId;
	private int results;
	private String dynamicBannerId;

	public void setRedirectUrl(String redirectUrl){
		this.redirectUrl = redirectUrl;
	}

	public String getRedirectUrl(){
		return redirectUrl;
	}

	public void setSelectedDept(String selectedDept){
		this.selectedDept = selectedDept;
	}

	public String getSelectedDept(){
		return selectedDept;
	}

	public void setCategoryTitle(String categoryTitle){
		this.categoryTitle = categoryTitle;
	}

	public String getCategoryTitle(){
		return categoryTitle;
	}

	public void setChildCategoriesCount(int childCategoriesCount){
		this.childCategoriesCount = childCategoriesCount;
	}

	public int getChildCategoriesCount(){
		return childCategoriesCount;
	}

	public void setProducts(List<ProductsItem> products){
		this.products = products;
	}

	public List<ProductsItem> getProducts(){
		return products;
	}

	public void setFacets(List<FacetsItem> facets){
		this.facets = facets;
	}

	public List<FacetsItem> getFacets(){
		return facets;
	}

	public void setStaticLinks(List<Object> staticLinks){
		this.staticLinks = staticLinks;
	}

	public List<Object> getStaticLinks(){
		return staticLinks;
	}

	public void setCrumbs(List<CrumbsItem> crumbs){
		this.crumbs = crumbs;
	}

	public List<CrumbsItem> getCrumbs(){
		return crumbs;
	}

	public void setEndecaCanonical(String endecaCanonical){
		this.endecaCanonical = endecaCanonical;
	}

	public String getEndecaCanonical(){
		return endecaCanonical;
	}

	public void setSeoInformation(SeoInformation seoInformation){
		this.seoInformation = seoInformation;
	}

	public SeoInformation getSeoInformation(){
		return seoInformation;
	}

	public void setPagesAvailable(int pagesAvailable){
		this.pagesAvailable = pagesAvailable;
	}

	public int getPagesAvailable(){
		return pagesAvailable;
	}

	public void setMultiCatSelected(String multiCatSelected){
		this.multiCatSelected = multiCatSelected;
	}

	public String getMultiCatSelected(){
		return multiCatSelected;
	}

	public void setSeoBannerId(String seoBannerId){
		this.seoBannerId = seoBannerId;
	}

	public String getSeoBannerId(){
		return seoBannerId;
	}

	public void setResults(int results){
		this.results = results;
	}

	public int getResults(){
		return results;
	}

	public void setDynamicBannerId(String dynamicBannerId){
		this.dynamicBannerId = dynamicBannerId;
	}

	public String getDynamicBannerId(){
		return dynamicBannerId;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"redirectUrl = '" + redirectUrl + '\'' + 
			",selectedDept = '" + selectedDept + '\'' + 
			",categoryTitle = '" + categoryTitle + '\'' + 
			",childCategoriesCount = '" + childCategoriesCount + '\'' + 
			",products = '" + products + '\'' + 
			",facets = '" + facets + '\'' + 
			",staticLinks = '" + staticLinks + '\'' + 
			",crumbs = '" + crumbs + '\'' + 
			",endecaCanonical = '" + endecaCanonical + '\'' + 
			",seoInformation = '" + seoInformation + '\'' + 
			",pagesAvailable = '" + pagesAvailable + '\'' + 
			",multiCatSelected = '" + multiCatSelected + '\'' + 
			",seoBannerId = '" + seoBannerId + '\'' + 
			",results = '" + results + '\'' + 
			",dynamicBannerId = '" + dynamicBannerId + '\'' + 
			"}";
		}
}