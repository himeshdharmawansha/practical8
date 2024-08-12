import scala.io.StdIn.readLine

object hello{

	def encrypt(text: String, shift:Int): String = {
	       
	       text.map((ele) => {
	       		if(ele.isLetter){
	       		  val base = if (ele.isLower) 'a' else 'A';
	       		  ((ele - base + shift) % 26 + base).toChar;
	       	}else{
	       		ele
	       	}
	  });
  }
	  
	  
	def decrypt(text: String, shift: Int):String = {
	
		text.map((ele) => {
			if(ele.isLetter){
			  val base = if(ele.isLower) 'a' else 'A';
			  ((ele - base - shift) % 26 + base).toChar;
		}else{
			ele
		}
	  });   		
  }
  
	def cipher(text:String, shift:Int, function: (String, Int) => String): String = {
		
		function(text, shift);
  }

       def main(args: Array[String]): Unit = {
    		
    		val text = "Its Me";
    		val shift = 2;
    		
    		val encryptedText = cipher(text, shift, encrypt);
    		println("Encrypted output : " + encryptedText);
    		
    		val decryptedText = cipher(encryptedText, shift, decrypt);
    		println("Decrypted output : " + decryptedText);
  }	
}
