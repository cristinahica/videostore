package videostore.horror;
public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String title;
	private Integer prc;

	public Movie(String title, Integer priceCode) {
		title = title;
		prc = priceCode;
	}

	public Integer getPrC() {
		return prc;
	}

	public void setPrCode(Integer arg) {
		prc = arg;
	}

	public String getTitle() {
		return title;
	};
}