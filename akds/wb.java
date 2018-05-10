/*
   cc Õ¯¬Áø™πÿ
   pp ping∞Ÿ∂»
   bw ±‡“Î
   gl π»∏Ë‰Ø¿¿
   ww ¥Úø™ww.java
   zd zd.java
 **** ¥Úø™ startŒƒµµ
 gx ∏¸–¬” º˛ ˝¡ø
 test ≤‚ ‘Õ¯¬Áhttp://weibo.com/u/501?sudaref=www.baidu.com&retcode=6102&is_all=1
 */
//ww.class∏ƒ√˚÷Æ∫Û±‡“Îª·±®’“≤ªµΩ¿‡£¨µ´ «÷¥––µƒ ±∫Úø…“‘√ª”–ww
//33¿Ôµƒ ˝◊÷√∞∫≈ø’∏Ò-≤ªº”√‹£¨ ÷ª˙…œ‘Ú «À˘”–Œƒº˛ ◊––20ø™Õ∑«““ª∂®≥§∂»∑∂Œßƒ⁄≤ªº”√‹
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.net.*;
import java.util.regex.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.Console;
import java.util.Calendar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.Properties;  
/*import javax.mail.Address;  
import javax.mail.BodyPart;  
import javax.mail.Flags;  
import javax.mail.Folder;  
import javax.mail.Message;  
import javax.mail.MessagingException;  
import javax.mail.Multipart;  
import javax.mail.Part;  
import javax.mail.Session;  
import javax.mail.Store;  
//import javax.mail.IMAPStore;  
import javax.mail.internet.InternetAddress;  
import javax.mail.internet.MimeMessage;  
import javax.mail.internet.MimeMultipart;  
import javax.mail.internet.MimeUtility;
*/

public class wb implements ActionListener,KeyListener,Runnable
{ 
    ImageIcon imgi;
    JFrame mainFrame; //÷˜√Ê∞Â 
    Container thisContainer; 
    int fontsize=20;
    int size=13;
    int length;
    JPanel centerPanel,northPanel,jp; //◊”√Ê∞Â 
    JTextField text1,text3;
    JPasswordField text2;
    JTextArea ta=new JTextArea();
    JScrollPane p1;
    JButton btnA,btnS,btnL,recoverButton,restartButton,deleteSaveButton; //ÕÀ≥ˆ£¨÷ÿ¡–£¨÷ÿ–¬ø™ º∞¥≈• 
    String a,b,strtemp="",filepre="0x";
    StringBuffer strb;
    StringBuffer textbuf=new StringBuffer(strtemp);
    int caret;
    static int wwtimes=0;
    static boolean yxww=false;//‘ –Ìww
    static boolean keypress=false;
    static boolean closeweb=false;
    static int sleeptime=3300;
    static int mailnum=0;
    static int mailcount=0;
    static Calendar calendar = Calendar.getInstance();
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//…Ë÷√»’∆⁄∏Ò Ω
    static long cstarttime=System.currentTimeMillis();
    static long cpasstime=System.currentTimeMillis();
    static boolean ring=true,ring2=false;
    static String website="www.baidu.com";
    static String key="ll";  
    // String fileaddress="d://wb.txt";
    static String fileaddress="JaZ2~mÒê±„\\$u{.";
    static String web[]={"dI T\"R9m7'/#<-g-C93\"#n_B^\"Q.n7x~7c,X$X",
        "dI T\"R9m7'/#<-g-C93! kYAX S.n7x~7c,X$X",
        //  "dI T\"RQ/m;//+&'Hg,De+#&g[CY+hn!#?g6+\"E*]P0R:0coe<,*RV9:~#S	d1.&7LXL\rKTk=95BrF#\\Y","",
        "dI T\"RQ/m;//+&'Hg,De+#&g[CY+irU3r6X",
        "dI T\"RQ/m;//+&'Hg,De+#&g[CY+irU3r6X",
        "dI T\"RU:e:%/* &pjEz|xqlKlo?|\nyF$(0<VUB0v9t~:R0ld",
        //   "dI T\"RU:e:%/* &pjEz|xqlKlo?|\nyF$(0<VUB0v9t~=S>mb"
        // "dI TkG	9*knu)&(}-C93|-_}u$:j47,6XtRrZ\\,qY:;8@kT(nUw{\""
        //   +"\r"+"%e?.W8[#]'Iu"                        <a href="//2.taobao.com/item.htm?id=53
    };
    static String start[]=new String [web.length];
    static ArrayList<String> keylist=new ArrayList<String>();
    static ArrayList<String> orderlist=new ArrayList<String>();
    static ArrayList<String> songlist=new ArrayList<String>();
    //    ArrayList<String> websites=new ArrayList<String>();
    //    ArrayList<String> deletesites=new ArrayList<String>();
    public void init(){      
       
        mainFrame=new JFrame(""); 
        thisContainer = mainFrame.getContentPane(); 
        thisContainer.setLayout(new BorderLayout()); 
        jp=new JPanel();
        centerPanel=new JPanel(); 
        northPanel=new JPanel(); 
        thisContainer.add(centerPanel,"Center"); 
        thisContainer.add(northPanel,"North"); 
        btnA=new JButton("A"); 
        btnA.addActionListener(this); 
        btnS=new JButton("S"); 
        btnS.addActionListener(this); 
        btnL=new JButton("L"); 
        btnL.addActionListener(this); 
        deleteSaveButton=new JButton("DS"); 
        deleteSaveButton.addActionListener(this); 
        text1=new JTextField(10);
        text2=new JPasswordField(10);
        text3=new JTextField(""+size,3);
        text3.addActionListener(this);
        text1.addActionListener(this);
        northPanel.add(text1); 
        northPanel.add(text2); 
        northPanel.add(text3); 
        northPanel.add(btnA); 
        northPanel.add(btnS); 
        northPanel.add(btnL); 
        northPanel.add(deleteSaveButton); 
        ta.setFont(new Font("ÀŒÃÂ",Font.PLAIN,fontsize));
        ta.addKeyListener(this);
        //ta.setSize(755,579);∫√œÒ√ª”√
        ta.setRows(440/fontsize);
        ta.setColumns(1400/fontsize);
        ta.setOpaque(false);
        p1=new JScrollPane(ta);
        p1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ta.setLineWrap(true);
        centerPanel.add(p1);
        //ta.addKeyListener(this);
        mainFrame.setBounds(280,10,800,650); 
        mainFrame.setVisible(true); 
        ta.addKeyListener(this);
    } 
    public void rename(String old,String newfile)
    {
        File file=new File(old);
        if(file.exists())
            file.renameTo(new File(newfile));
    }
    public void keyPressed(KeyEvent e)
    {	
        keypress=!keypress; //≤ª√˜∞◊Œ™ ≤√¥“ª∞¥œ¬ª·÷¥––¡Ω¥Œ
        if(keypress)
            if(e.getKeyCode()==KeyEvent.VK_CAPS_LOCK) //text2.getPassword()∑µªÿµƒ «char ˝◊È£¨÷±Ω” ‰≥ˆµƒ «µÿ÷∑
            {String str=ta.getText();a=text1.getText();b=new String(text2.getPassword())+"OP";
                //if(b.equals("")) b="1234";//System.out.println(a);
                //System.out.println(b+" "+b.length());
                encode(str,a,b);text2.setText("OP");}
    }
    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
    public void actionPerformed(ActionEvent e) { 
        String str=ta.getText();
        a=text1.getText();
        b=new String(text2.getPassword());
        if(e.getSource()==text3) 
        {
            String t3=text3.getText();
            if(t3.length()<=0)
            {
                text1.setText("");
                //System.out.print("\r\n");
                System.out.print("\r                                                                 \n");
            }
            else if(t3.charAt(0)<='9'&&t3.charAt(0)>='0')
            {size=Integer.parseInt(t3);
                ta.setFont(new Font("ÀŒÃÂ",Font.PLAIN,size));}
            else
            {
                int startindex=str.indexOf("********");
                if(startindex<0)
                {
                    return;
                }
                startindex=str.indexOf('\n'+t3+' ',startindex);
                if(startindex<0) return;
                //System.out.println(""+startindex+str.charAt(startindex));
                int endindex=str.indexOf("\n",startindex+1);
                //System.out.println(""+endindex+str.charAt(endindex));
                String jiema=str.substring(startindex+t3.length()+2,endindex);
                if(endindex>startindex)
                {
                    if(!a.equals(jiema))
                        text1.setText(jiema);
                    else
                        System.out.print("\r"+jiema+"                                       ");
                }
                else text1.setText("not found!");

            }
        }
        else 	if(!a.contains("."))
            a+=".txt";
        if(e.getSource()==text1) 
        {

            try{
                File  f=new  File(a);  
                Long filelength=f.length();
                byte [] bl=new byte[filelength.intValue()];
                FileInputStream in = new FileInputStream(a);
                in.read(bl);
                in.close();

                str=new String(bl);
                if(a.equals("44.txt")||a.equals("55.txt")||a.equals("33.txt")||a.equals("22.txt"))
                    filepre=a;
                else filepre="0x";
                ta.setText(str);
            }
            catch(IOException eee){System.out.print(eee);};
            /*StringBuffer stb=new StringBuffer();
              for(int i=12352;i<=12544;i++)
            //stb.append((char)i);
            ta.append("\n"+i+'\t'+(char)i);*/
        }
        else if(e.getSource()==btnL)	 
        {
            String strr=ta.getText();
            ta.setText("");
            for(int i=strr.length()-1;i>=0;i--)
                ta.append(""+strr.charAt(i));

        }
        if(e.getSource()==btnA) 
        {
            if(b.length()==0){
                doOpen(str);
                return;
            }
            if(!a.equals("33.txt")) //“‘«∞º”¡Àtxt»¥≤ª÷™µ¿
            {
                //     System.out.println("haha");
                // 	long timestart=System.currentTimeMillis();
                encode(str,a,b);
                //    System.out.println("encode time "+(System.currentTimeMillis()-timestart));
            }
            else
            {
                if(b.length()<3) return;
                StringBuffer sbh=new StringBuffer("");
                String temp;
                char ch='\n';
                int pospre=0,posafter=0;
                //  print(str.indexOf(ch,100000));// ‰≥ˆ-1£¨µ´∏–æı≤ª∞≤»´
                while((posafter=str.indexOf(ch,pospre))!=-1)
                {
                    temp=str.substring(pospre,posafter+1);
                  //  System.out.println(temp);
                    sbh.append(halfencode(temp,b));
                    pospre=posafter+1;

                }
                temp=str.substring(pospre);

                  //  System.out.println(temp);
                sbh.append(halfencode(temp,b));

                //      System.out.println("hass");
                //   String snew=halfencode(str,b);
                caret=ta.getCaretPosition();
                ta.setText(sbh.toString());
                ta.setCaretPosition(caret);
            }
        }
        if(e.getSource()==deleteSaveButton) 
        {
            if(!a.equals("33.txt"))
                return;
            try{
                char ch='\n';
                int pos33=str.indexOf(ch);
                pos33=str.indexOf(ch,pos33+1)+1;
                String datetime=str.substring(pos33,str.indexOf(ch,pos33));
                str=str.substring(pos33);
                ta.setText(str);
                System.out.print("clock time: "+datetime);
                Date date = sdf.parse(datetime);        
                calendar.setTime(date);
                Calendar calendar0 = Calendar.getInstance();
                calendar0.setTime(new Date());
                long timeclock=calendar.getTimeInMillis()-calendar0.getTimeInMillis();
                timeclock/=60000;
                if(timeclock<60)
                    System.out.println("\t\twait "+timeclock+" minutes");
                else if(timeclock<1440)
                    System.out.println("\t\twait "+timeclock/60+" hours "+timeclock%60+" minutes");
                else System.out.println("\t\twait "+timeclock/1440+" days "
                        +timeclock%1440/60+" hours "+timeclock%60+" minutes");
                FileWriter writeFile=new FileWriter(new File(a));
                writeFile.write(str);
                writeFile.close();
            }
            catch(Exception eee){System.out.print(eee);};
        }
        if(e.getSource()==btnS) 
        {
            try{
                //a=text1.getText();
                if(a.contains("save")) {text1.setText(text1.getText()+" can't save");return;}
                strtemp=ta.getText();
                if(a.equals(".txt")) 
                {
                    System.out.println("	can not save!");text1.setText(text1.getText()+" can't save");return;
                }
                if(a.equals("55.txt")) 
                {
                    if(strtemp.charAt(0)>=48 && strtemp.charAt(0)<=57)//0-9
                        if(strtemp.charAt(1)=='.' || strtemp.charAt(2)=='.')
                        {System.out.println("	can not save!");text1.setText(text1.getText()+" can't save");return;}
                }
                if(a.equals("55.txt")||a.equals("33.txt")||a.equals("44.txt")||a.equals("22.txt")) 
                {
                    if(!a.equals(filepre))
                    {System.out.println(filepre+"	file not right!");
                        text1.setText(text1.getText()+" can't save");return;}
                }
                if(a.equals("mm.txt")) 
                {
                    {System.out.println(a+"	file can not save!");text1.setText(text1.getText()+" can't save");return;}
                }
                if(a.equals("mmm.txt")) 
                {
                    a="mm.txt";
                }
                //System.out.println("Text length£∫"+str.length());
                //System.out.println(df.format(new Date()));// new Date()Œ™ªÒ»°µ±«∞œµÕ≥ ±º‰
                if(a.equals("33.txt")) 
                {
                    //     print("33.txt");
                    char ch='\n';
                    String datetime=str.substring(0,str.indexOf(ch));
                    System.out.print("clock time: "+datetime);
                    Date date = sdf.parse(datetime);        
                    calendar.setTime(date);
                    Calendar calendar0 = Calendar.getInstance();
                    calendar0.setTime(new Date());
                    long timeclock=calendar.getTimeInMillis()-calendar0.getTimeInMillis();
                    timeclock/=60000;
                    if(timeclock<60)
                        System.out.println("\t\twait "+timeclock+" minutes");
                    else if(timeclock<1440)
                        System.out.println("\t\twait "+timeclock/60+" hours "+timeclock%60+" minutes");
                    else System.out.println("\t\twait "+timeclock/1440+" days "
                            +timeclock%1440/60+" hours "+timeclock%60+" minutes");
                    //   br.close();
                    //   reader.close();
                }
                FileWriter writeFile=new FileWriter(new File(a));
                writeFile.write(str);
                writeFile.close();
                if(a.equals("22.txt")) 
                {
                    FileReader reader = new FileReader(a); 
                    BufferedReader br = new BufferedReader(reader);
                    print("before "+keylist.size());
                    keylist.clear();
                    orderlist.clear();
                    String temp;
                    int tempindex=0;
                    while((temp=br.readLine())!=null) {
                        tempindex=temp.indexOf(' ');
                        if(tempindex>0){
                            keylist.add(temp.substring(0,tempindex));
                            orderlist.add(temp.substring(tempindex+1));
                        }
                    } 
                    print("after "+keylist.size());
                    br.close();
                    reader.close();
                }
                text1.setText(text1.getText()+" saved");
                System.out.println(a+" saved at "+sdf.format(new Date())+"\tText length£∫"+str.length());
            }
            catch(Exception eee){};
        }
    } 
    void luntan(String firsturl,String encode,String mark,String repeat,String say,int after) throws Exception
    {
        try {
            URL pageUrl=new URL(firsturl);
            HttpURLConnection con;
            InputStream in;
            BufferedReader reader;    // Read page into buffer.
            String line;
            con = (HttpURLConnection)pageUrl.openConnection();
            con.setRequestProperty("User-Agent", "spider");
            con.setConnectTimeout(60000);  
            con.setReadTimeout(60000);  

            in = con.getInputStream();
            reader = new BufferedReader(new InputStreamReader(in, encode));
            int rownum=0;
            int responseCode = -1; 
            responseCode = con.getResponseCode();  
            // System.out.println("responseCode:"+responseCode);
            if (responseCode == -1) {  
                System.out.println(firsturl.toString() + " : connection is failure...");  
                con.disconnect();  
                return ;  
            }  
            if (responseCode >= 400) // «Î«Û ß∞‹  
            {  
                System.out.println("«Î«Û ß∞‹:get response code: " + responseCode);  
                con.disconnect();  
                return;  
            }  
            while ((line = reader.readLine()) != null)
            {
                rownum++;
                if(line.contains(mark))
                {//System.out.println(line);
                    for(int i=0;i<after;i++)
                        line=reader.readLine();
                    if(!line.startsWith(repeat))
                    {
                        System.out.print(say+" find!");
                        //   System.out.println(line);
                        FileWriter writer = new FileWriter(fileaddress); 
                        BufferedWriter bw = new BufferedWriter(writer);
                        String temp="";
                        for(int j=0;j<start.length;j++)
                            temp+=start[j]+"\r\n";
                        for(int j=0;j<start.length;j++)
                        {
                            if(start[j].equals(repeat))
                            {
                                start[j]=line.substring(0,repeat.length());
                                website=web[j];
                            }
                            bw.write(start[j]+"\r\n");
                        }
                        bw.write("\r\n"+temp);
                        bw.close();
                        writer.close();
                        while(ring)
                        {
                            Toolkit.getDefaultToolkit().beep();
                            Thread.sleep(sleeptime);
                        }
                    }
                    else System.out.print(say+" not find!");
                    break;
                }
            }
            if(rownum!=0)
                System.out.println("\t"+rownum);
            else System.out.println("can not fetch!");
        }
        catch (Exception ee) 
        {
            System.out.println(ee);
            while(true)
            {
                Toolkit.getDefaultToolkit().beep();
                Thread.sleep(sleeptime);
            }
        }
        ring=true;
    }
    void writeFile(String line,String repeat) throws Exception //repeat «‘≠±æµƒ£¨Ω¯–––ﬁ∏ƒ
    {
        FileWriter writer = new FileWriter(fileaddress); 
        BufferedWriter bw = new BufferedWriter(writer);
        String temp="";
        for(int j=0;j<start.length;j++)
            temp+=start[j]+"\r\n";
        for(int j=0;j<start.length;j++)
        {
            if(start[j].equals(repeat))
            {
                start[j]=line.substring(0,repeat.length());
                website=web[j];
                String wes="ajax/member/getSubmitVideos?mid=";
                if(website.contains(wes))
                    website=website.replace(wes,"");
            }
            bw.write(start[j]+"\r\n");
        }
        bw.write(mailnum+"\r\n"+temp);
        bw.close();
        writer.close();
    }

    void judgebz(String firsturl,String encode,String mark,String repeat,String say) throws Exception //B’æ≈–∂œ
    {
        try {
            URL pageUrl=new URL(firsturl);
            HttpURLConnection con;
            InputStream in;
            BufferedReader reader;    // Read page into buffer.
            String line;
            con = (HttpURLConnection)pageUrl.openConnection();
            con.setRequestProperty("User-Agent", "spider");
            con.setConnectTimeout(60000);  
            con.setReadTimeout(60000);  

            in = con.getInputStream();
            reader = new BufferedReader(new InputStreamReader(in, encode));
            int rownum=0;
            int responseCode = -1; 
            responseCode = con.getResponseCode();  
            // System.out.println("responseCode:"+responseCode);
            if (responseCode == -1) {  
                System.out.println(firsturl.toString() + " : connection is failure...");  
                con.disconnect();  
                return ;  
            }  
            if (responseCode >= 400) // «Î«Û ß∞‹  
            {  
                System.out.println("«Î«Û ß∞‹:get response code: " + responseCode);  
                con.disconnect();  
                return;  
            }  
            while ((line = reader.readLine()) != null)
            {
                rownum++;
                if(line.contains(mark))
                {
                    String marklater=line.substring(line.indexOf(mark)+mark.length(),line.indexOf(mark)+mark.length()+4);
                    if(!marklater.equals(repeat))
                    {
                        System.out.print(say+" find!");
                        //   System.out.println(line);
                        writeFile(marklater,repeat);
                        textbuf.append(line);
                        int linecount=0;
                        while((line = reader.readLine()) != null&&linecount++<20){
                            textbuf.append(line);
                        }
                        alarm();
                        Toolkit.getDefaultToolkit().beep();
                        while(ring)
                        {
                            Thread.sleep(sleeptime);
                        }
                    }
                    break;
                }
            }
        }
        catch (Exception ee) 
        {
            //   System.out.println("bz connect error");
            Thread.sleep(sleeptime);
        }
        ring=true;
    }
    void judge(String firsturl,String encode,String mark,String repeat,String say,int after) throws Exception //after «≤ÈµΩmark∫Ûœ»Ã¯π˝µƒ–– ˝
    {
        try {
            URL pageUrl=new URL(firsturl);
            HttpURLConnection con;
            InputStream in;
            BufferedReader reader;    // Read page into buffer.
            String line;
            con = (HttpURLConnection)pageUrl.openConnection();
            con.setRequestProperty("User-Agent", "spider");
            con.setConnectTimeout(60000);  
            con.setReadTimeout(60000);  

            in = con.getInputStream();
            reader = new BufferedReader(new InputStreamReader(in, encode));
            int rownum=0;
            /*     int responseCode = -1; 
                   responseCode = con.getResponseCode();  
            // System.out.println("responseCode:"+responseCode);
            if (responseCode == -1) {  
            System.out.println(firsturl.toString() + " : connection is failure...");  
            con.disconnect();  
            return ;  
            }  
            if (responseCode >= 400) // «Î«Û ß∞‹  
            {  
            System.out.println("«Î«Û ß∞‹:get response code: " + responseCode);  
            con.disconnect();  
            return;  
            }  */
            if(firsturl.contains("5sing")) {reader.skip(10000);}
            while ((line = reader.readLine()) != null)
            {
                rownum++;
                if(line.contains(mark))
                {//System.out.println(line);
                    for(int i=0;i<after;i++)
                        line=reader.readLine();
                    if(!line.startsWith(repeat))
                    {
                        System.out.print(say+" find!");
                        //   System.out.println(line);
                        writeFile(line,repeat);
                        textbuf.append(line);
                        int linecount=0;
                        while((line = reader.readLine()) != null&&linecount++<20){
                            textbuf.append(line);
                        }

                        alarm();
                        Toolkit.getDefaultToolkit().beep();
                        while(ring)
                        {
                            Thread.sleep(sleeptime);
                        }
                    }
                    else System.out.print(say+" not find!");
                    break;
                }
            }
            if(rownum!=0)
                System.out.println("\t"+rownum);
            else System.out.println("can not fetch!");
        }
        catch (Exception ee) 
        {
            System.out.println("connect error");
            // Thread.sleep((int)(660000*(1+Math.random())));
            //while(true)
            {
                //   Toolkit.getDefaultToolkit().beep();
                Thread.sleep(sleeptime);
            }
        }
        ring=true;
    }

    void judge(String firsturl,String encode,String mark,String repeat,String mark2,String repeat2,String say) throws Exception
    {
        try {
            URL pageUrl=new URL(firsturl);
            HttpURLConnection con;
            InputStream in;
            BufferedReader reader;    // Read page into buffer.
            String line;
            con = (HttpURLConnection)pageUrl.openConnection();
            con.setRequestProperty("User-Agent", "spider");
            con.setConnectTimeout(60000);  
            con.setReadTimeout(60000);  

            in = con.getInputStream();
            reader = new BufferedReader(new InputStreamReader(in, encode));
            int rownum=0;
            int responseCode = -1; 
            responseCode = con.getResponseCode();  
            // System.out.println("responseCode:"+responseCode);
            if (responseCode == -1) {  
                System.out.println(firsturl.toString() + " : connection is failure...");  
                con.disconnect();  
                return ;  
            }  
            if (responseCode >= 400) // «Î«Û ß∞‹  
            {  
                System.out.println("«Î«Û ß∞‹:get response code: " + responseCode);  
                con.disconnect();  
                return;  
            }  
            while ((line = reader.readLine()) != null)
            {
                rownum++;
                if(line.contains(mark))
                {//System.out.println(line);
                    if(!line.startsWith(repeat))
                    {
                        System.out.print(say+" find wen!");
                        //  System.out.println(line);

                        writeFile(line,repeat);
                        int linecount=0;
                        textbuf.append(line);
                        while((line = reader.readLine()) != null&&linecount++<20){
                            textbuf.append(line);
                        }
                        alarm();
                        Toolkit.getDefaultToolkit().beep();
                        while(ring)
                        {
                            //Toolkit.getDefaultToolkit().beep();
                            Thread.sleep(sleeptime);
                        }
                    }
                    else System.out.print(say+" not find!");
                    break;
                }
            }
            System.out.print("\t"+rownum);
            while ((line = reader.readLine()) != null)
            {
                rownum++;
                if(line.contains(mark2))
                {
                    if(!line.startsWith(repeat2))
                    {
                        System.out.print(say+" find!");
                        //     System.out.println(line);
                        writeFile(line,repeat2);
                        int linecount=0;
                        textbuf.append(line);
                        while((line = reader.readLine()) != null&&linecount++<20){
                            textbuf.append(line);
                        }
                        alarm();
                        Toolkit.getDefaultToolkit().beep();
                        while(ring)
                        {
                            //Toolkit.getDefaultToolkit().beep();
                            Thread.sleep(sleeptime);
                        }
                    }
                    else System.out.print("\tnot find!");
                    break;
                }
            }
            if(rownum!=0)
                System.out.println("\t"+rownum);
            else System.out.println("can not fetch!");
        }
        catch (Exception ee) 
        {
            System.out.println("connect error");
            //Thread.sleep((int)(660000*(1+Math.random())));
            //while(true)
            {
                //  Toolkit.getDefaultToolkit().beep();
                Thread.sleep(sleeptime);
            }
        }
        ring=true;
    }
    public static String encode(String str,String b)
    {

        StringBuffer strb=new StringBuffer("");
        int len=b.length();
        int c[]=new int[len+1],cc[]=new int[len+1];
        c[0]=(int)(len*len*Math.sqrt(len)+len*Math.cos(len))%512;
        cc[0]=(int)Math.exp(7+Math.cos(c[0]))%128;
        int i;
        for(i=1;i<=len;i++)
        {
            c[i]=(int)(c[i-1]/2*(Math.pow(cc[i-1],Math.PI))+Math.sqrt(5*b.charAt(i-1)))%512;
            cc[i]=(int)(Math.hypot(c[i],cc[i-1])+Math.log(c[i-1]+7)*b.charAt(i-1))%128;
        }
        int d[]=new int[len+2],dd[]=new int[len+2];
        d[len+1]=(int)(len*len*len*cc[len]+c[len]*(13+Math.sin(cc[len-1])))%512;
        dd[len+1]=d[len+1]/4;
        d[0]=(int)(c[len]*c[len-1]*cc[len-2]+Math.sqrt(b.charAt(0)*b.charAt(1)+1000))%512;
        dd[0]=d[0]%128;
        for(i=1;i<=len;i++)
        {
            d[i]=(int)(d[i-1]*Math.pow(cc[len-i],Math.E)+3*b.charAt(len-i)*c[i-1])%512;
            dd[i]=(int)(Math.pow(d[i]%230,4)+(b.charAt(i-1)/Math.tan(cc[i]/128.0+0.1))%(c[i-i]+47))%128;
        }
        int f[]=new int [len],ff[]=new int[len];
        f[0]=(int)(b.charAt(len/2)*d[len]*(2+Math.tan(dd[len]/128.0))+c[0])%512;
        ff[0]=(c[0]+d[0]+cc[0]+dd[0]+f[0]+d[len])%128;
        for(i=1;i<len;i++)
        {
            f[i]=(int)(f[i-1]*d[len-i]+b.charAt(len-i)*Math.sqrt(b.charAt(i))/Math.log(b.charAt(i-1)+len))%512;
            ff[i]=(int)(f[i]*(Math.cos(dd[i])+b.charAt(i))*Math.sqrt(c[i])+Math.log(cc[i]+len)*Math.pow(d[i],Math.E-1)+ff[i-1])%128;
        }

        int length=str.length();
        int in,cz,pp=0,ss=0,zz=0,qq=0,sss=0;char ch;
        for(i=0;i<length;i++)
        {
            in=(int)str.charAt(i);
            //System.out.println(in);
            if(in<=127)
            {
                pp=(++pp)%(len+2);zz=(++zz)%(len+1);qq=(++qq)%len;
                ss=(ss+b.charAt(qq)+cc[len-zz]*sss)%128;
                sss=(sss*dd[qq]+d[pp]*(f[qq]+c[zz]+ss))%128;
                cz=in^dd[pp]^ss^sss^ff[qq]^cc[zz];
                if(cz!=0&&cz!=13) strb.append((char)cz);//13 «ªÿ≥µ\r
                else strb.append((char)in);}
            else if(in>19967&&in<40448)
            {				pp=(++pp)%(len+2);zz=(++zz)%(len+1);qq=(++qq)%len;
                if(in>20479&&in<38912){
                    ss=(ss+b.charAt(qq)+13*c[len-zz]*ff[qq])%2048;
                    sss=(sss+d[zz]+(d[pp]*(f[len-1-qq]+ss))%b.charAt(qq))%2048;}
                else{
                    ss=(ss+7*b.charAt(qq)*cc[len-zz])%512;
                    sss=(sss+dd[zz]*(b.charAt(qq)+c[len-zz])+ss*ff[qq])%512;}
                cz=in^d[pp]^ss^sss^f[qq]^c[zz];

                //	System.out.println(""+in+" "+d[pp]+' '+ss+' '+f[qq]+' '+c[zz]+' ');
                strb.append((char)cz);}
            //		else if(in>12352&&in<12439||in>12440&&in<12544)
            else if(in>12352&&in<12436||in>12448&&in<12535)
            {				pp=(++pp)%(len+2);zz=(++zz)%(len+1);qq=(++qq)%len;
                ss=(ss+7*b.charAt(qq)*cc[len-zz])%512;
                sss=(d[pp]^ss^sss^f[qq]^c[zz])%64;
                cz=in^sss;
                if(cz>12352&&cz<12436||cz>12448&&cz<12535) strb.append((char)cz);
                else strb.append((char)in);
            }
            else
            {
                ++ss;
                strb.append((char)in);
                //		System.out.println(""+in+" "+(char)in+' '+ss+' '+f[qq]+' '+c[zz]+' ');
            }
            //System.out.println(""+ss+' '+sss);
        }
        return strb.toString();
    }
    public static String halfencode(String str,String b)
    {

        StringBuffer strb=new StringBuffer("");
        int len=b.length();
        int c[]=new int[len+1],cc[]=new int[len+1];
        c[0]=(int)(len*len*Math.sqrt(len)+len*Math.cos(len))%512;
        cc[0]=(int)Math.exp(7+Math.cos(c[0]))%128;
        int i;
        for(i=1;i<=len;i++)
        {
            c[i]=(int)(c[i-1]/2*(Math.pow(cc[i-1],Math.PI))+Math.sqrt(5*b.charAt(i-1)))%512;
            cc[i]=(int)(Math.hypot(c[i],cc[i-1])+Math.log(c[i-1]+7)*b.charAt(i-1))%128;
        }
        int d[]=new int[len+2],dd[]=new int[len+2];
        d[len+1]=(int)(len*len*len*cc[len]+c[len]*(13+Math.sin(cc[len-1])))%512;
        dd[len+1]=d[len+1]/4;
        d[0]=(int)(c[len]*c[len-1]*cc[len-2]+Math.sqrt(b.charAt(0)*b.charAt(1)+1000))%512;
        dd[0]=d[0]%128;
        for(i=1;i<=len;i++)
        {
            d[i]=(int)(d[i-1]*Math.pow(cc[len-i],Math.E)+3*b.charAt(len-i)*c[i-1])%512;
            dd[i]=(int)(Math.pow(d[i]%230,4)+(b.charAt(i-1)/Math.tan(cc[i]/128.0+0.1))%(c[i-i]+47))%128;
        }
        int f[]=new int [len],ff[]=new int[len];
        f[0]=(int)(b.charAt(len/2)*d[len]*(2+Math.tan(dd[len]/128.0))+c[0])%512;
        ff[0]=(c[0]+d[0]+cc[0]+dd[0]+f[0]+d[len])%128;
        for(i=1;i<len;i++)
        {
            f[i]=(int)(f[i-1]*d[len-i]+b.charAt(len-i)*Math.sqrt(b.charAt(i))/Math.log(b.charAt(i-1)+len))%512;
            ff[i]=(int)(f[i]*(Math.cos(dd[i])+b.charAt(i))*Math.sqrt(c[i])+Math.log(cc[i]+len)*Math.pow(d[i],Math.E-1)+ff[i-1])%128;
        }

        int length=str.length();
        int in,cz,pp=0,ss=0,zz=0,qq=0,sss=0;char ch;
        for(i=0;i<length;i++)
        {
            in=(int)str.charAt(i);
            //System.out.println(in);
            if(in<=127&&in!=10&&in!=13&&in!='-'&&in!=' '&&in!=':'&&(in<'0'||in>'9'))
            {
                pp=(++pp)%(len+2);zz=(++zz)%(len+1);qq=(++qq)%len;
                ss=(ss+b.charAt(qq)+cc[len-zz]*sss)%128;
                sss=(sss*dd[qq]+d[pp]*(f[qq]+c[zz]+ss))%128;
                cz=in^dd[pp]^ss^sss^ff[qq]^cc[zz];
                if(cz!=0&&cz!=10&&cz!=13&&cz!='-'&&cz!=' '&&cz!=':'&&(cz<'0'||cz>'9')) strb.append((char)cz);
                else strb.append((char)in);}
            else if(in>19967&&in<40448)
            {				pp=(++pp)%(len+2);zz=(++zz)%(len+1);qq=(++qq)%len;
                if(in>20479&&in<38912){
                    ss=(ss+b.charAt(qq)+13*c[len-zz]*ff[qq])%2048;
                    sss=(sss+d[zz]+(d[pp]*(f[len-1-qq]+ss))%b.charAt(qq))%2048;}
                else{
                    ss=(ss+7*b.charAt(qq)*cc[len-zz])%512;
                    sss=(sss+dd[zz]*(b.charAt(qq)+c[len-zz])+ss*ff[qq])%512;}
                cz=in^d[pp]^ss^sss^f[qq]^c[zz];

                //	System.out.println(""+in+" "+d[pp]+' '+ss+' '+f[qq]+' '+c[zz]+' ');
                strb.append((char)cz);}
            //		else if(in>12352&&in<12439||in>12440&&in<12544)
            else if(in>12352&&in<12436||in>12448&&in<12535)
            {				pp=(++pp)%(len+2);zz=(++zz)%(len+1);qq=(++qq)%len;
                ss=(ss+7*b.charAt(qq)*cc[len-zz])%512;
                sss=(d[pp]^ss^sss^f[qq]^c[zz])%64;
                cz=in^sss;
                if(cz>12352&&cz<12436||cz>12448&&cz<12535) strb.append((char)cz);
                else strb.append((char)in);
            }
            else
            {
                ++ss;
                strb.append((char)in);
                //		System.out.println(""+in+" "+(char)in+' '+ss+' '+f[qq]+' '+c[zz]+' ');
            }
            //System.out.println(""+ss+' '+sss);
        }
        return strb.toString();
    }
    public void encode(String str,String a,String b) //aŒ™Œƒº˛£¨ÕÍ≥…∫ÛŒƒº˛√˚±ª÷√Œ™ø’
    {

        //b=new String(text2.getPassword());
        if(b.equals(""))
            return;
        strb=new StringBuffer("");

        if(str.equals(""))//»ÙŒƒ±æøÚŒ™ø’‘Ú∂¡»°Œƒº˛‘Ÿº”√‹
        {
            if(a.equals(""))
                return;
            try{
                File  f=new  File(a);  
                Long filelength=f.length();
                byte [] bl=new byte[filelength.intValue()];
                FileInputStream in = new FileInputStream(a);
                in.read(bl);
                in.close();

                str=new String(bl);
                /*		char c[]=new char[len];
                        FileReader  readfile=new  FileReader(f);
                        int in,cz,pp=0,ss=0;char ch;
                        while((in=readfile.read())!=-1)
                        { 
                        if(in<=127||(in>19967&&in<40832))
                        {
                        pp=(++pp)%len;
                        cz=in^b.charAt(pp)^ss^pp;
                        strb.append((char)cz);}
                        else
                        {
                        ss=(++ss)%100;
                        strb.append((char)in);
                        }
                        }
                        ta.setText(strb.toString());
                        ta.setCaretPosition(caret);
                        readfile.close();*/}
                catch(IOException eee){System.out.print(eee);};
        }
        int len=b.length();
        int c[]=new int[len+1],cc[]=new int[len+1];
        c[0]=(int)(len*len*Math.sqrt(len)+len*Math.cos(len))%512;
        cc[0]=(int)Math.exp(7+Math.cos(c[0]))%128;
        int i;
        for(i=1;i<=len;i++)
        {
            c[i]=(int)(c[i-1]/2*(Math.pow(cc[i-1],Math.PI))+Math.sqrt(5*b.charAt(i-1)))%512;
            cc[i]=(int)(Math.hypot(c[i],cc[i-1])+Math.log(c[i-1]+7)*b.charAt(i-1))%128;
        }
        int d[]=new int[len+2],dd[]=new int[len+2];
        d[len+1]=(int)(len*len*len*cc[len]+c[len]*(13+Math.sin(cc[len-1])))%512;
        dd[len+1]=d[len+1]/4;
        d[0]=(int)(c[len]*c[len-1]*cc[len-2]+Math.sqrt(b.charAt(0)*b.charAt(1)+1000))%512;
        dd[0]=d[0]%128;
        //	int i;
        for(i=1;i<=len;i++)
        {
            d[i]=(int)(d[i-1]*Math.pow(cc[len-i],Math.E)+3*b.charAt(len-i)*c[i-1])%512;
            dd[i]=(int)(Math.pow(d[i]%230,4)+(b.charAt(i-1)/Math.tan(cc[i]/128.0+0.1))%(c[i-i]+47))%128;
            //		System.out.println(cc[i]/128.0+3);
            //	System.out.println(Math.tan(cc[i]/128.0+3));
        }
        int f[]=new int [len],ff[]=new int[len];
        f[0]=(int)(b.charAt(len/2)*d[len]*(2+Math.tan(dd[len]/128.0))+c[0])%512;
        ff[0]=(c[0]+d[0]+cc[0]+dd[0]+f[0]+d[len])%128;
        for(i=1;i<len;i++)
        {
            f[i]=(int)(f[i-1]*d[len-i]+b.charAt(len-i)*Math.sqrt(b.charAt(i))/Math.log(b.charAt(i-1)+len))%512;
            ff[i]=(int)(f[i]*(Math.cos(dd[i])+b.charAt(i))*Math.sqrt(c[i])+Math.log(cc[i]+len)*Math.pow(d[i],Math.E-1)+ff[i-1])%128;
        }
        /*			for(i=0;i<len;i++)
                    {
                    System.out.println(""+(int)b.charAt(i)+'\t'+c[i]+'\t'+cc[i]+'\t'+d[i]+'\t'+dd[i]+'\t'+f[i]+'\t'+ff[i]);
                    }
                    System.out.println("\t"+c[len]+'\t'+cc[len]+'\t'+d[len]+'\t'+dd[len]);
                    System.out.println("\t\t\t"+d[len+1]+'\t'+dd[len+1]);*/
        caret=ta.getCaretPosition();
        {
            length=str.length();
            int in,cz,pp=0,ss=0,zz=0,qq=0,sss=0;char ch;
            for(i=0;i<length;i++)
            {
                in=(int)str.charAt(i);
                //System.out.println(in);
                if(in<=127)
                {
                    pp=(++pp)%(len+2);zz=(++zz)%(len+1);qq=(++qq)%len;
                    ss=(ss+b.charAt(qq)+cc[len-zz]*sss)%128;
                    sss=(sss*dd[qq]+d[pp]*(f[qq]+c[zz]+ss))%128;
                    cz=in^dd[pp]^ss^sss^ff[qq]^cc[zz];
                    if(cz!=0&&cz!=13) strb.append((char)cz);
                    else strb.append((char)in);}
                else if(in>19967&&in<40448)
                {				pp=(++pp)%(len+2);zz=(++zz)%(len+1);qq=(++qq)%len;
                    if(in>20479&&in<38912){
                        ss=(ss+b.charAt(qq)+13*c[len-zz]*ff[qq])%2048;
                        sss=(sss+d[zz]+(d[pp]*(f[len-1-qq]+ss))%b.charAt(qq))%2048;}
                    else{
                        ss=(ss+7*b.charAt(qq)*cc[len-zz])%512;
                        sss=(sss+dd[zz]*(b.charAt(qq)+c[len-zz])+ss*ff[qq])%512;}
                    cz=in^d[pp]^ss^sss^f[qq]^c[zz];

                    //	System.out.println(""+in+" "+d[pp]+' '+ss+' '+f[qq]+' '+c[zz]+' ');
                    strb.append((char)cz);}
                //		else if(in>12352&&in<12439||in>12440&&in<12544)
                else if(in>12352&&in<12436||in>12448&&in<12535)
                {				pp=(++pp)%(len+2);zz=(++zz)%(len+1);qq=(++qq)%len;
                    ss=(ss+7*b.charAt(qq)*cc[len-zz])%512;
                    sss=(d[pp]^ss^sss^f[qq]^c[zz])%64;
                    cz=in^sss;
                    if(cz>12352&&cz<12436||cz>12448&&cz<12535) strb.append((char)cz);
                    else strb.append((char)in);
                }
                else
                {
                    ++ss;
                    strb.append((char)in);
                    //		System.out.println(""+in+" "+(char)in+' '+ss+' '+f[qq]+' '+c[zz]+' ');
                }
                //System.out.println(""+ss+' '+sss);
            }
            ta.setText(strb.toString());
            ta.setCaretPosition(caret);
        }
        text1.setText("");
    }
    public void openwebsite(String url)
    {
        try{
            java.net.URI uri = java.net.URI.create(url); 
            java.awt.Desktop dp = java.awt.Desktop.getDesktop(); 
            if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) 
                dp.browse(uri);// ªÒ»°œµÕ≥ƒ¨»œ‰Ø¿¿∆˜¥Úø™¡¥Ω”       
        }
        catch(Exception e){};
    }
    public void run() 
    {
        Console console = System.console();  
        String password,wwtext=""; 
        String essential="00";
        String ess=essential;
        boolean findcode=false;

        while(true){
            try{
                //System.out.println("input: ");  
                findcode=false;
                password = new String(console.readPassword());  
                if(password.equals(ess))
                {
                    if(ring2)
                    {
                        init();     
                        ring2=false;
                        text1.setText("33");
                        filepre="33.txt";
                        File  f=new  File(filepre);  
                        Long filelength=f.length();
                        byte [] bl=new byte[filelength.intValue()];
                        FileInputStream in = new FileInputStream("33.txt");
                        in.read(bl);
                        in.close();
                        String str=new String(bl);
                        ta.setText(str);
                        System.out.println("go on...");  
                    }
                    else if(closeweb)                    
                    {
                        System.out.println("web closed!"); 
                    }
                    else{
                        //System.out.println("\r*******");  
                        try { 

                            String url = website;
                            java.net.URI uri = java.net.URI.create(url); 
                            // ªÒ»°µ±«∞œµÕ≥◊¿√Ê¿©’π 
                            java.awt.Desktop dp = java.awt.Desktop.getDesktop(); 
                            // ≈–∂œœµÕ≥◊¿√Ê «∑Ò÷ß≥÷“™÷¥––µƒπ¶ƒ‹ 
                            if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) { 
                                //File file = new File("D:\\aa.txt"); 
                                //dp.edit(file);// °°±‡º≠Œƒº˛ 
                                dp.browse(uri);// ªÒ»°œµÕ≥ƒ¨»œ‰Ø¿¿∆˜¥Úø™¡¥Ω” 
                                // dp.open(file);// ”√ƒ¨»œ∑Ω Ω¥Úø™Œƒº˛ 
                                // dp.print(file);// ”√¥Ú”°ª˙¥Ú”°Œƒº˛
                                website="www.baidu.com";
                            } 
                        } catch (java.lang.NullPointerException e) { 
                            // ¥ÀŒ™uriŒ™ø’ ±≈◊≥ˆ“Ï≥£ 
                            e.printStackTrace(); 
                        } catch (java.io.IOException e) { 
                            // ¥ÀŒ™Œﬁ∑®ªÒ»°œµÕ≥ƒ¨»œ‰Ø¿¿∆˜ 
                            e.printStackTrace(); 
                        } 
                        ring=false;
                        System.out.println("go on...");  
                    }
                }
                else if(password.equals("gt"))// £”‡‘§∂®ƒ÷÷” ±º‰
                {
                    Calendar calendar0 = Calendar.getInstance();
                    calendar0.setTime(new Date());
                    long timeclock=calendar.getTimeInMillis()-calendar0.getTimeInMillis();
                    timeclock/=60000;
                    if(timeclock<0)
                    {
                        System.out.println("It's ok now");
                        yxww=true;
                    }
                    else
                    {
                        if(timeclock<60)
                            System.out.println("Please wait "+timeclock+" minutes patiently.");
                        else if(timeclock<1440)
                            System.out.println("Please wait "+timeclock/60+" hours "+timeclock%60+" minutes patiently.");
                        else System.out.println("Please wait "+timeclock/1440+" days "
                                +timeclock%1440/60+" hours "+timeclock%60+" minutes patiently.");
                    }
                }
                else if(password.equals("gx"))
                {
                  //  updatemail();                 
                }
                else if(password.equals("\'\'"))  //µ•“˝∫≈“≤“™◊™“Â
                {
                    randsing();                
                }
                else if(password.equals("pp"))
                {
                    Runtime.getRuntime().exec("cmd /c start ping www.baidu.com");
                }
                else if(password.equals("wb"))
                {
                    Runtime.getRuntime().exec("cmd /c start wb.java");
                }
                else if(password.equals("bw"))
                {
                    //  rename("÷’ƒ©÷Æ ±","ww.class");
                    //  System.out.println("rename ok");  

                    Runtime.getRuntime().exec("cmd /c start javac wb.java");
                    System.out.println("javac");  
                    Thread.sleep(10000);
                    //  rename("ww.class","÷’ƒ©÷Æ ±");
                }
                else if(password.equals("zd"))
                {
                    Runtime.getRuntime().exec("cmd /c start java zd");  
                }
                else if(encode("start ",password).equals("`,#4S"))
                {
                    Runtime.getRuntime().exec("cmd /c start "+fileaddress);  
                }
                /*else if(password.equals("gl"))
                  {
                  Runtime.getRuntime().exec("cmd /c start C:\\Users\\lenovo\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");  
                  }*/
                else if(password.equals("cc"))//Õ¯¬Áø™πÿ
                {
                    closeweb=true;
                    System.out.println("close connect");
                }
                else if(password.equals("ccccccccccccc"))//Õ¯¬Áø™πÿ
                {
                    closeweb=false;
                    System.out.println("open connect");
                }
                else if(password.equals("test"))//œﬂ≥Ã»Áπ˚∑¢œ÷ª·œ›»ÎÀ¿—≠ª∑£¨Œﬁ∑®‘Ÿ ‰»Î÷∏¡Ó£¨µ√÷ÿ∆Ù
                {
                    if(!closeweb)
                    {   ring=false;
                        //receivemail(); ring=false;
                        judge(web[0],"utf-8","li><strong class=",start[0],"51",0); ring=false;
                        // judge(web[1],"utf-8","li><strong class=",start[1],"52",0); ring=false;
                        judge(web[2],"utf-8","mod=wenzhangmod",start[2],"href=\"/50170",start[3],"wb"); ring=false;
                        judgebz(web[4],"utf-8","},\"count\":",start[4],"zl");  ring=false; 
                    }
                }
                else if(password.equals("text"))
                {
                    System.out.println(textbuf.toString());
                }
                else if(password.equals("cctb"))
                {
                    textbuf=new StringBuffer("");
                    System.out.println("textbuf cleared");
                              }else if(password.equals("cp")||password.equals("fcp")){
                        File  f=new  File("11.txt");  
                        //System.out.println(password);  
                        Long filelength=f.length();
                        byte [] bl=new byte[filelength.intValue()];
                        FileInputStream in = new FileInputStream(f);
                        in.read(bl);
                        in.close();
                        String str=new String(bl);
                        String []filenames = str.split("\n");
                        fileChange fc = new fileChange();
                        if(password.equals("cp")){
                            fc.copy(filenames);
                        } else {
                            fc.fCopy(filenames);
                        }
                }
                else if(password.equals("66")||password.equals("77")||password.equals("88")||password.equals("55")||password.equals("44")||password.equals("33")||password.equals("22")||password.equals("11")||password.equals("mm"))
                {
                    wb lt = new wb(); 
                    lt.init()  ;                
                    try{
                        File  f=new  File(password+".txt");  
                        //System.out.println(password);  
                        Long filelength=f.length();
                        byte [] bl=new byte[filelength.intValue()];
                        FileInputStream in = new FileInputStream(password+".txt");
                        in.read(bl);
                        in.close();
                        String str=new String(bl);
                        lt.ta.setText(str);
                        lt.filepre=password+".txt";
                        lt.text1.setText(password);

                    }
                    catch(Exception eee){System.out.print("kkk"+eee);};
                }
                else if(password.charAt(password.length()-1)=='0')
                {
                    if(password.length()>3||password.charAt(0)<='0'||password.charAt(0)>'9'
                            ||password.charAt(1)<'0'||password.charAt(1)>'9')
                    {System.out.println("no signal");  continue;}
                    //long timepass=Long.parseLong(password);
                    System.out.println(password+" minutes' clock..."+sdf.format(new Date()));
                    cpasstime=Long.parseLong(password);
                    System.out.println("go on...");  
                    cstarttime=System.currentTimeMillis();

                }
                else if(password.charAt(0)=='0')
                {
                    if(password.length()==2&&
                            password.charAt(1)>'0'&&password.charAt(1)<='9')
                    {
                        //long timepass=Long.parseLong(password);
                        System.out.println(password+" minutes' clock..."+sdf.format(new Date()));
                        cpasstime=Long.parseLong(password);
                        cstarttime=System.currentTimeMillis();
                    }

                }
                else if(password.equals("ess"))
                {
                    ess=essential;
                    print("necessary to w");
                }
                /*else if(password.equals("hao"))
                  {
                  Calendar calendar2 = Calendar.getInstance();
                  calendar2.setTime(new Date());
                  if(calendar2.get(calendar2.HOUR_OF_DAY)<=13&&calendar2.get(calendar2.HOUR_OF_DAY)>=11||calendar2.get(calendar2.HOUR_OF_DAY)>=18) //11µ„µΩ14µ„÷Æº‰
                  {
                  String url = "http://www.hao123.com/gaoxiao/haomeizi/list";
                  openwebsite(url);
                  }                    System.out.println("go on...");  

                  else
                  print("hao no signal");
                  }*/
                else
                {
                    for(int i=0;i<keylist.size();i++)
                    {
                        if(password.equals(keylist.get(i)))
                        {
                            if(password.equals("ww"))
                            {
                                wwtext=orderlist.get(i);
                                break;
                            }
                            if(orderlist.get(i).startsWith("cmd"))
                            {
                                if((password.equals("gl")||password.equals("glessential"))&&!closeweb||(!password.equals("gl")&&!password.equals("glessential")))
                                    Runtime.getRuntime().exec(orderlist.get(i));  
                            }
                            else if(!closeweb&&ess.equals("00"))
                            {String url = orderlist.get(i);
                                openwebsite(url);}
                            findcode=true;
                            break;
                        }
                    }
                    if(!findcode&&!password.equals("ww")) System.out.println("no signal");  
                }
                if(password.equals("ww"))
                {
                    try{  //’‚∏ˆtry catch≤ª∆◊˜”√£¨»Áπ˚√ª”–wwŒƒº˛±‡“Î ±æÕª·±®¥Ì
                        if(wwtimes==0&&yxww)
                        {
                            rename("÷’ƒ©÷Æ ±","ww.class");
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTime(new Date());
                            /*  if(calendar2.get(calendar2.HOUR_OF_DAY)<2||calendar2.get(calendar2.HOUR_OF_DAY)<1) //11µ„µΩ14µ„÷Æº‰
                                {
                                System.out.println("Please wait patiently");
                                }
                                else*/
                            { ww ll=new ww();ll.init();ll.ta.setText(wwtext);wwtimes++;
                                Thread.sleep(1000);//∑¿÷πø…ƒ‹≥ˆœ÷wwªπ√ª∂¡»°æÕ∏ƒ¡À√˚◊÷
                                rename("ww.class","÷’ƒ©÷Æ ±");
                            }
                        }
                        else {
                            // System.out.println("Today is over! Please wait tomorrow patiently.");

                            System.out.println("Please wait till clock time patiently.");
                        };
                    }
                    catch(Exception eee){System.out.print("ww not exist!");};
                    //Runtime.getRuntime().exec("cmd /c start java ww");  
                }


            }
            catch (Exception e)
            {
                //System.out.println("over"+e.getMessage());
            }
        }
        //s.close();
    }
    public static void ismonthend()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.DATE, (calendar.get(Calendar.DATE) + 1));
        if (calendar.get(Calendar.DAY_OF_MONTH) == 1) 
        {
            System.out.println("It's the last day of this month"); 
        } 
        calendar.set(Calendar.DATE, (calendar.get(Calendar.DATE) + 1));
        if (calendar.get(Calendar.DAY_OF_MONTH) == 1) 
        {
            System.out.println("It's the penultimate last day of this month"); 
        } 
    }
    /*public void updatemail() throws Exception {  
        // ◊º±∏¡¨Ω”∑˛ŒÒ∆˜µƒª·ª∞–≈œ¢  
        Properties props = new Properties(); 
        props.setProperty("mail.store.protocol", "pop3");       // –≠“È  
        props.setProperty("mail.pop3.port", "110");             // ∂Àø⁄  
        props.setProperty("mail.pop3.host", "pop3.163.com");    // pop3∑˛ŒÒ∆˜  

        // ¥¥Ω®Session µ¿˝∂‘œÛ  
        Session session = Session.getInstance(props);  
        //IMAPStore store = (IMAPStore)session.getStore("imap");  
        Store store = session.getStore("pop3");  
        store.connect("interwgyi@163.com", encode("eS AjX",key));  

        // ªÒµ√ ’º˛œ‰  
        Folder folder = store.getFolder("INBOX");  
        // Folder.READ_ONLY£∫÷ª∂¡»®œﬁ 
        // Folder.READ_WRITE£∫ø…∂¡ø…–¥£®ø…“‘–ﬁ∏ƒ” º˛µƒ◊¥Ã¨£© 

        folder.open(Folder.READ_WRITE); //¥Úø™ ’º˛œ‰  
        mailcount=folder.getMessageCount();
        mailnum=mailcount;
        writeFile("XXXXX","YYYY");
        System.out.println("mail number updated!");
        // Õ∑≈◊ ‘¥  
        folder.close(true);  
        store.close();  
    } 
    public int receivemail() //throws Exception 
    {  

        // ◊º±∏¡¨Ω”∑˛ŒÒ∆˜µƒª·ª∞–≈œ¢  
        try{
            Properties props = new Properties(); 
            //props.put("mail.store.protocol", "imap");  
            // props.put("mail.imap.host", "imap.163.com");  
            props.setProperty("mail.store.protocol", "pop3");       // –≠“È  
            props.setProperty("mail.pop3.port", "110");             // ∂Àø⁄  
            props.setProperty("mail.pop3.host", "pop3.163.com");    // pop3∑˛ŒÒ∆˜  

            // ¥¥Ω®Session µ¿˝∂‘œÛ  
            Session session = Session.getInstance(props);  
            //IMAPStore store = (IMAPStore)session.getStore("imap");  
            Store store = session.getStore("pop3");  
            store.connect("interwgyi@163.com", encode("eS AjX",key));  

            // ªÒµ√ ’º˛œ‰  
            Folder folder = store.getFolder("INBOX");  
            // Folder.READ_ONLY£∫÷ª∂¡»®œﬁ 
            // Folder.READ_WRITE£∫ø…∂¡ø…–¥£®ø…“‘–ﬁ∏ƒ” º˛µƒ◊¥Ã¨£© 

            folder.open(Folder.READ_WRITE); //¥Úø™ ’º˛œ‰  
            mailcount=folder.getMessageCount();
            if(mailcount!=mailnum)
            {
                alarm();
                Toolkit.getDefaultToolkit().beep();
                website="http://mail.163.com/?UserName=interwgyi@163.com&Passwd="+encode("eS AjX",key);
                System.out.println("16 find! "+mailcount+"-"+mailnum); 
                mailnum=mailcount;
                writeFile("XXXXX","YYYY");
                while(ring)
                {
                    Thread.sleep(sleeptime);
                }
            }
            else System.out.println("16 not find!"); 
            ring=true;

            // ”…”⁄POP3–≠“ÈŒﬁ∑®ªÒ÷™” º˛µƒ◊¥Ã¨,À˘“‘getUnreadMessageCountµ√µΩµƒ « ’º˛œ‰µƒ” º˛◊‹ ˝  
            //System.out.println("Œ¥∂¡” º˛ ˝: " + folder.getUnreadMessageCount());  

            // ”…”⁄POP3–≠“ÈŒﬁ∑®ªÒ÷™” º˛µƒ◊¥Ã¨,À˘“‘œ¬√Êµ√µΩµƒΩ·π˚ º÷’∂º «Œ™0  
            //System.out.println("…æ≥˝” º˛ ˝: " + folder.getDeletedMessageCount());  
            //System.out.println("–¬” º˛: " + folder.getNewMessageCount());  

            // ªÒµ√ ’º˛œ‰÷–µƒ” º˛◊‹ ˝  
            // System.out.println("” º˛◊‹ ˝: " + folder.getMessageCount());  

            // µ√µΩ ’º˛œ‰÷–µƒÀ˘”–” º˛,≤¢Ω‚Œˆ  
            //  Message[] messages = folder.getMessages();  
            //   parseMessage(messages);  

            // Õ∑≈◊ ‘¥  
            folder.close(true);  
            store.close();  
        }
        catch(Exception ee){System.out.println("16 connect error");};
        return mailcount;
    } */

    public void randsing() throws Exception
    {        
        readsonglist();
        int rad=(int)(Math.random()*songlist.size());
        Runtime.getRuntime().exec("cmd /c start "+songlist.get(rad));  
    }
    public void readsonglist() throws Exception
    {
        if(songlist.size()==0)
        {
            File f=new File("F:\\MUSIC");
            for(File ff:f.listFiles()){
                if(ff.getAbsolutePath().endsWith(".mp3"))
                    songlist.add(ff.getAbsolutePath());
            }
        }
    }
    public static void print(String str0)
    {
        System.out.println(str0);
    }
    public static void print(int str0)
    {
        System.out.println(str0);
    }
    int findFront(String str,int caret){
        for(int i=caret-1;i>=0;i--){
            if(str.charAt(i)=='\n')
                return i;
        }
        return 0;
    }
    int findEnd(String str,int caret){
        if(str.length()==0) return 0;
        for(int i=caret;i<str.length();i++){
            if(str.charAt(i)=='\n')
                return i;
        }
        return str.length();
    }
    public void doOpen(String str0){
        int caret=ta.getCaretPosition();
        int start=findFront(str0,caret);
        int end=findEnd(str0,caret);
        if(start>=end) return;
        String str=str0.substring(start,end);
        str=str.replace("\r","");
        str=str.replace("\n","");
        if(str.equals("")) return;
    //    print(""+caret+" "+start+" "+end+" "+str);
        if(str.startsWith("http")){
  //          print("str = "+str);
            openwebsite(str);//Õ¯÷∑”–ø’∏ÒªÚ’ﬂÀ´“˝∫≈ø…ƒ‹√ª∑¥”¶
            return;
        }
        if(str.length()>33)
            str=str.substring(0,33);
        try{
            String url=URLEncoder.encode(str,"utf-8");
      //      print("url = "+url);
            openwebsite("http://www.baidu.com/s?wd="+url);
        }catch (Exception ee){ee.printStackTrace();};
    }
    public static void alarm(){
        //Runtime.getRuntime().exec("cmd /c start mfctest.exe"); 
        wb nn=new wb();
        nn.init();
        nn.ta.setText("ALARM");
       // Frame fr=new Frame();
       // fr.setVisible(true);
    }
    public static void alarm33() throws Exception{
        wb lt=new wb();
        lt.init();
        lt.ta.setText("ALARM");
        File  f=new  File("33.txt");  
                        Long filelength=f.length();
                        byte [] bl=new byte[filelength.intValue()];
                        FileInputStream in = new FileInputStream(f);
                        in.read(bl);
                        in.close();
                        String str=new String(bl);
                        lt.ta.setText(str);
                        lt.filepre="33.txt";
                        lt.text1.setText("33");
    }

    public static void main(String[] args) throws Exception
    { 
        //ismonthend();
        if(args.length>0)
            key = encode(args[0],"ac")+(args[0].charAt(3)-key.charAt(0)+42);
        //receive();
        wb ll = new wb(); 
        int i=0;
        //Runtime.getRuntime().exec("ping www.baidu.com");//’‚¡Ω∏ˆ∂º√ª∑¥”¶
        //Runtime.getRuntime().exec("cmd /c start F:\\ad\\Œƒµµ\\vimøÿ÷∆Ã®÷∏¡Ó.txt");              

        Thread thread=new Thread(ll);
        thread.start();
        //receivemail();


        FileReader reader = new FileReader("33.txt"); 
        BufferedReader br = new BufferedReader(reader);
        String datetime=br.readLine();
        //System.out.println(datetime);
        Date date = sdf.parse(datetime);        
        calendar.setTime(date);
        br.close();
        reader.close();

        fileaddress=encode(fileaddress,key);
        reader = new FileReader(fileaddress); 
        br = new BufferedReader(reader);
        while(i<start.length) {
            start[i++]=br.readLine();
        } 
        mailnum=0;//Integer.parseInt(br.readLine());
        //   System.out.println(start.length);
        br.close();
        reader.close();

        reader = new FileReader("22.txt"); 
        br = new BufferedReader(reader);
        String temp;
        int tempindex=0;
        while((temp=br.readLine())!=null) {
            tempindex=temp.indexOf(' ');
            if(tempindex>0){
                keylist.add(temp.substring(0,tempindex));
                orderlist.add(temp.substring(tempindex+1));
            }
        } 
        br.close();
        reader.close();

        for(i=0;i<web.length;i++)
        {    
            web[i]=encode(web[i],key);
        }       
        //     print(web[4]);
        //  print(web[5]);
        //    closeweb=true; //µ˜ ‘”Ôæ‰
        Runtime.getRuntime().exec("cmd /c start mfctest.exe"); 

        Calendar calendar2 = Calendar.getInstance();
        boolean fetchtb=false;
        while(true)
        {
            if(!closeweb)
            {
                //   ll.receivemail();
                        ll.judge(web[0],"utf-8","li><strong class=",start[0],"51",0);
                //    ll.judge(web[1],"utf-8","li><strong class=",start[1],"52",0);
                         ll.judge(web[2],"utf-8","mod=wenzhangmod",start[2],"href=\"/50170",start[3],"wb");
                         ll.judgebz(web[4],"utf-8","],\"count\":",start[4],"zl");
                //ll.judge(web[4],"gbk","<div class=\"item-pic",start[4],"tb",1);*/
                //     System.out.println((cpasstime*60*1000+cstarttime-System.currentTimeMillis())/60000+" minutes of "+cpasstime);
            }
            for(int times=0;times<6;times++)
            {
                calendar2.setTime(new Date());
                if(System.currentTimeMillis()-cstarttime>cpasstime*60*1000) //…Ë∂®∑÷÷”ƒ÷÷”
                {
                    print("It's clock time. go on...");
                    alarm();
                    cstarttime=System.currentTimeMillis();

                }
                //print(""+calendar2.get(calendar2.HOUR_OF_DAY));//calendar2.HOUR_OF_DAY «≥£¡ø£¨’‚∏ˆ≈™¡À∞ÎÃÏ

                if(!fetchtb&&calendar2.get(calendar2.HOUR_OF_DAY)>31)//&&calendar2.get(calendar2.DAY_OF_MONTH)>29)
                {
                    print("It's o time");
                    fetchtb=true;
                    alarm();
                }
                if(calendar.compareTo(calendar2)<0)
                {
                    System.out.println("It's 33 time");
                    ring2=true;
                    yxww=true;
                    alarm33();
                    Toolkit.getDefaultToolkit().beep();
                    while(ring2)
                    {
                        Thread.sleep(sleeptime);
                    }

                }
                //else System.out.println("not time");
                Thread.sleep((int)(60000*(2+Math.random())));
            }
        }//*/
    } 
}







