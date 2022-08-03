package videostore.horror;
public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String _title;
	private Integer _prc;

	public Movie(String title, Integer priceCode) {
		_title = title;
		_prc = priceCode;
	}

	public Integer getPrC() {
		return _prc;
	}

	public void setPrCode(Integer arg) {
		_prc = arg;
	}

	public String getTitle() {
		return _title;
	};
}