import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class XgameTest {
  Contorller con = new Contorller();
  @DataProvider(name="SinupData")
  public Object[][] p(){
	return new Object[][]{{"st","st",1,"st","student"},{"st1","st1",2,"st1","student"},{"st2","st2",3,"st2","student"},{"t","t",1,"t","teacher"},{"t1","t1",2,"t1","teacher"}};
	  
  }
  @DataProvider(name="loginData")
  public Object[][] p1(){
	return new Object[][]{{true,"st",1,"student"},{false,"st1",6,"student"},{true,"st2",3,"student"},{true,"t",1,"teacher"},{false,"t1",5,"teacher"}};
	  
  }
  @DataProvider(name="addgameData")
  public Object[][]p2(){
	  return new Object[][]{{"mcq","g1","mcq\ng1\n 1\nq1\na1\na2\na3\na4\na1\nq2\na1\na2\na3\na4\na2\nq3\na1\na2\na3\na4\na3\nq4\na1\na2\na3\na4\na4\n"},{"truefalse","g2","truefalse\ng2\n2\nq1\ntrue\nq2\ntrue\nq3\nfalse\nq4\ntrue\n"}};
  }
  @DataProvider (name="playGameData")
  public Object[][]p3(){
	  return new Object[][]{{"g1","mcq","a1\na2\na3\na4",4},{"g1","mcq","a1\na1\na1\na1",1},{"g1","mcq","a2\na1\na1\na1",0},{"g2","truefalse","true\ntrue\nfalse\ntrue",4}};
  }
  @Test(dataProvider="SinupData",priority=1)
  public void testSinup(String name ,String username  , int password ,String mail , String type){
  Assert.assertEquals(true, con.signup(name, username,(int) password, mail, type));
  }
  
  @Test(dataProvider="loginData",priority=2)
  public void testlogin(Boolean result,String username ,int password , String type){
	  Boolean expected= con.login(username, password, type);
	  Assert.assertEquals(result, expected );
  }
  @Test(dataProvider="addgameData",priority=3)
  public void testAddGame(String return2,String return1,String in){
	  Scanner input=new Scanner(in);
	  String returnArr[]=new String[2];
	  returnArr=con.addgame(input);
	  Assert.assertEquals(return1, returnArr[0]);
	  Assert.assertEquals(return2, returnArr[1]);
	  input.close();
  }
  @Test(dataProvider="playGameData",priority=4)
  public void testPlayGame(String name, String type,String in, int score){
	  Scanner input=new Scanner(in);
	  con.play_game(name, type, input);
	  Assert.assertEquals(score, con.score);
  }
  
  
}
