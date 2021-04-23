package hu.xa1y5k.harmadik;

public class ForditoGep {

 private String bemenet;


 public ForditoGep(String bemenet)
 {
    this.bemenet = bemenet;
 }

 public void forditas()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(this.bemenet);

    this.bemenet=sb.reverse().toString();

 }
 public String getBemenet()
 {
    return this.bemenet;
 }


 public void setBemenet(String bemenet)
 {
     this.bemenet = bemenet;
 }



}
