package ch.hwz.bfas;

import java.util.ArrayList;
import java.util.List;

public class Portfolio extends abstractPortfolio {

	
	
	private int portfolioID = 1;
	private List<String> portfolioList = new ArrayList<String>();

	
	
	
	
	
	
	// Get und Set
	public int getPortfolioID() {
		return portfolioID;
	}

	public void setPortfolioID(int portfolioID) {
		this.portfolioID = portfolioID;
	}

	public List<String> getPortfolioList() {
		return portfolioList;
	}

	public void setPortfolioList(List<String> portfolioList) {
		this.portfolioList = portfolioList;
	}
	
	// Portfolio dem Depot zuweisen Methode ist in Depot.
	
	
	
	


}
