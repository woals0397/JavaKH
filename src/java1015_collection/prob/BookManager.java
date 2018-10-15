package java1015_collection.prob;

import java.util.ArrayList;


public class BookManager {
	public static int getRentalPrice(ArrayList<BookDTO> bookList, String kind) {
		// 구현하세요.
		int RentalPriceSum = 0;
		
		for(BookDTO bd : bookList) {
			if(bd.getKind().equals(kind))
				RentalPriceSum += bd.getRentalPrice();
		}
		
		return RentalPriceSum;
	}//end getRentalPrice()
}//end class






