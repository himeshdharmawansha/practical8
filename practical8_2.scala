import scala.io.StdIn.readLine

object hello{


       def main(args: Array[String]): Unit = {
    		
    		var num = readLine("Enter a number (0 to stop) : ").toInt;
    		
    		while(num!= 0){
	    		
	    		var multipleOfThree = (num: Int) => num%3 == 0;
	    		var multipleOfFive = (num: Int) => num%5 == 0;
	    		
	    		var text = (multipleOfThree(num),multipleOfFive(num)) match{
	       
			       case ( true, true) => "Multiple of Both Three and Five";
			       case ( true, false) => "Multiple of Three";
			       case ( false, true) => "Multiple of Five";
			       case ( false, false) => "Not a Multiple of Three or Five";
			  }
	    		
	    		println(text);
	    		
	    		num = readLine("Enter a number (0 to stop) : ").toInt;
    		}
  }	
}
