package array;

public class Array_02 {

	public static void main(String[] args) {
	String[] ar = {"사자","코끼리","호랑이","카멜레온","오리너구리","기린","원숭이"};
	
	//ar.length = 배열의 크기  일종의 방의 개수 
	for(int i = 0 ; i<ar.length; i++) {
		System.out.println("ar["+i+"] = "+ar[i]);
		System.out.println("문자열의 크기="+ar[i].length()); // 문자열의 크기는 사자 = 2개 오리너구리 =5  문자열의 크기는 lenth뒤에 ()써줘야함
		System.out.println("첫번쨰 문자 = "+ar[i].charAt(0)); // 0이 첫번쨰 첫번째 글자 
		System.out.println("마지막문자 = "+ar[i].charAt(ar[i].length()-1)); //0이 첫번쨰이니깐 -1 해줘야함 
	
	}
	System.out.println();
	System.out.println("확장형 for문");
	for(String aa : ar) {
		System.out.println(aa);
		
		}
	
	}

}

/*
ar[0] = 사자
문자열의 크기=2
첫번쨰 문자 = 사
마지막문자 = 자
ar[1] = 코끼리
문자열의 크기=3
첫번쨰 문자 = 코
마지막문자 = 리
ar[2] = 호랑이
문자열의 크기=3
첫번쨰 문자 = 호
마지막문자 = 이
ar[3] = 카멜레온
문자열의 크기=4
첫번쨰 문자 = 카
마지막문자 = 온
ar[4] = 오리너구리
문자열의 크기=5
첫번쨰 문자 = 오
마지막문자 = 리
ar[5] = 기린
문자열의 크기=2
첫번쨰 문자 = 기
마지막문자 = 린
ar[6] = 원숭이
문자열의 크기=3
첫번쨰 문자 = 원
마지막문자 = 이




*/