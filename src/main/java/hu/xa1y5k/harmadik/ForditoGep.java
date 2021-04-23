package hu.xa1y5k.harmadik;

public class ForditoGep {

 private String content;


 public ForditoGep(String content)
 {
    this.content = content;
 }

 public void forditas()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(this.content);

    this.content=sb.reverse().toString();

 }
 public String getContent()
 {
    return this.content;
 }


 public void setContent(String content)
 {
     this.content = content;
 }



}
