package java1002_api.prob;

/*
 * [출력결과]
 * Samsung 상품 정보
 * 제품번호 : PROD-00001, 제품명 : 갤럭시S, 수량 : 5, 가격 : 940000
 */
public class Prob001_RegExp {

	public static void main(String[] args) {
		String msg = "PROD-00001**Samsung**갤럭시S**5**940000";
		Product prod = createProduct(msg);
		System.out.println(prod.getMaker() + " 상품 정보");
		System.out.println(prod.toString());
	}// end main()

	private static Product createProduct(String message) {
		// 매개변수로 들어온 문자열을 적절히 이용하여
		// Product 객체를 생성후 리턴하는createProduct() 메서드를 구현하시오.
		// String->int : Integer.parseInt("10");
		Product pd = new Product();
		
		String[] data = message.replaceAll("[*]{2}", " ").split(" ");
		
		pd.setProductId(data[0]);
		pd.setMaker(data[1]);
		pd.setName(data[2]);
		pd.setAmount(Integer.parseInt(data[3]));
		pd.setPrice(Integer.parseInt(data[4]));

		return pd;
	}// end creatProduct
}// end class
