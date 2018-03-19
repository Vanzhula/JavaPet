
public class Fish extends Pet {
	int currentDepth=0;
	public int dive(int howDeep) {
		currentDepth=currentDepth + howDeep;
		   if (currentDepth > 100) {
			   System.out.print("� ��������� ����� "+
			                       " � �� ���� ������� ������ 100 ������");
		  currentDepth=currentDepth - howDeep;
		   }else {
			   System.out.println("���������� ��� �� " + howDeep +
					                                    " ������");
			   System.out.println("� �� ������� " + currentDepth +
					                                     " ������");
		   }
		   return currentDepth;
	}
	@
	public String say(String something) {
		return "�� �� �� ������, ��� ���� �� �������������?";
	}
}	
		/**System.out.println("����� �� ������� "
				                 + howDeep + " �����");
		System.out.println("� �� ������� "
				+ currentDepth + " ����� ���� ������ ����");
		return currentDepth;
	}
*/
 	
