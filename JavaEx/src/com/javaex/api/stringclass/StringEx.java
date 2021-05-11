package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringBasic();
		//usefulMethods();
		stringBufferEx();
	}
	// 문자열 객체 : 연결, 메서드 수행시 매번 새 String 반환
	// StringBuffer 경우 : 복잡할떄 저장공간 생성
	// 수행될떄 새로운객체가 생성되지 않는다.
	private static void stringBufferEx() {
		// 버퍼 생성
		StringBuffer sb = new StringBuffer("This");
		
		// 문자열 추가: append
		sb.append(" is pencil");
		// 문자열 삽입:insert
		sb.insert(8, "my");
		// 문자열 치환:replace
		sb.replace(8, 10,"your "); // 8번 인덱스부터 10번인덱스 앞까지
		
		//버퍼 사이즈 변경
		sb.setLength(10); // 내부 버퍼의 크기를 10으로 줄인다.
		System.out.println(sb);// 나머진 그냥 날려버림
		
		// StringBuffer의 메서드들은 연속해서 호출가능 -> 메서드 체이닝
		
		StringBuffer sb2 = new StringBuffer("This")
				.append(" is pencil")
				.insert(8,  "my")
				.replace(8,  10, "your ");
		String s = sb2.toString(); // 이부분에서 객체를 생성
		
		System.out.println("결과:" + s);
	}
	
	private static void stringBasic() {
		String s1 = "Java"; // 리터럴 (스트링 풀에서 관리되기떄문에 같은갚이면 같은객체이다)
		String s2 = new String("Java"); // 새 객체
		String s3 = "Java"; // 리터럴
		
		System.out.println("s1 == s2 ? "+ (s1 == s2));// 리터럴 vs new
		System.out.println("s1 == s3 ? "+ (s1 == s3));// 리터럴 vs 리터럴
		
		// valueOf() 메소드 : 기본 타입을 -> 문자열로 리턴
		String s4 = String.valueOf(Math.PI);
		System.out.println("valueOf 메서드:"+ s4);
		
	}
	
	private static void usefulMethods() {
		String str = "Java Programming JavaScript Programming";
		
		// 길이를 잡을 수 있고 인덱스 접근 가능
		System.out.println("LENGTH:" + str.length());
		System.out.println("5번 인덱스의 글자:" + str.charAt(5));
		
		// 변환 메서드
		System.out.println("소문자 변환:" + str.toLowerCase());
		System.out.println("대문자 변환:" + str.toUpperCase());
		
		// 검색 관련(쭝요)
		int idx;
		idx = str.indexOf("Java");
		System.out.println("1번째 검색:" + idx);
		idx = str.indexOf("Java", idx + 4);
		System.out.println("2번쨰 검색:" + idx);
		idx = str.indexOf("Java", idx + 4);
		System.out.println("3번쨰 검색:" + idx); // 검색어가 없을떄 -> -1
		// 역방향 검색
		System.out.println("역방향 검색:" + str.lastIndexOf("Java"));
		
		// 문자열 추출
		System.out.println("substring:" + str.substring(5)); // 5인덱스부터 끝까지
		System.out.println("substring:" + str.substring(5, 16)); //5 ~ 16-1
		
		// 치환
		System.out.println("replace:" + str.replaceAll("Java", "java"));
		
		// 공백문자 제거
		String s2 = "             Hello             ";
		String s3 = "           ,  Java             ";
		
		System.out.println(s2.trim() + s3.trim());
		
		// 분할: split 
		String[] chunks = str.split(" "); // 공백을 기준으로 문자열을 분할
		for(String chunk: chunks) {
			System.out.println("WORD:" + chunk);
		}
		
		// 문자열 비교: Unicode 비교
		// 같으면 0, 앞의 갚이 작으면(먼저) 음수, 앞의것이 크면(뒤면) 양수
		System.out.println("ABC".compareTo("ABD"));
		
		
		
		
		
		
		
		
		
	}

}
