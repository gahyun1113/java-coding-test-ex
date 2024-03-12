import  java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(); //ArrayList 는 디폴트 값으로 오브젝트 객체를 가져오지만 <String>으로 객체 타입을 지정해주기때문에 밑에서 형변환하지 않아도 된다.
        arrayList.add("one"); //리스트에 값 추가
        arrayList.add("two");

        for (int i=0; i < arrayList.size(); i++) {
            String value = arrayList.get(i);
        }
    }
}
