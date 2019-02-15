 String s = "";

 void foo() {
   s.toString();
   changeS(); // An other method can change the value of s!
   if(s == null) { } // Compliant, s changed
 }

 void changeS() {
   s = null;
 }