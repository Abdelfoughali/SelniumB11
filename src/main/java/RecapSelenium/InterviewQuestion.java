package RecapSelenium;

public class InterviewQuestion {
    /*
    1- what are the advantages and disadvantages of selenium
    --> advantage of selenium is a free open source and it is suppoting multiple language
    like java python and it is support multiple browser

    Disadvantage
    you can not automate the captcha picture mpbile application
    there is no direct call for the error report
    it only automate the web application
    it does not have a system  to generate  report so we use the test report

   2- What type of testing can you automate with selenium
   ***smoke
   ***Regression
   *** Functional test (positive and negative)

   3- What are the tupe of testing do not automate with selenium?
   *performance testing
   *manual testing (capthcha ,picture
   *Non-functional testing (performance,stress
   *load testing
   *stress testing

   4- what are the locators and what are they type
   locators is a way to find the element from the DOM (developement tool/page )
   -ID
   -Name
   -className
   -xpath
   -TagName
   -LinkText
   -partialLinkedText
   -Css

    5-How do handle the dynamic element CVS ask this Question a lot ******
    in my project, i faced many dynamic elements and i used different ways to handle with it
    i used parent child relation ship to locate the element i used special element type like following sibling
    contains

    6- different between driver.get() and driver.naviagte.to()

    navigateTo() it doest not wait for the weblement page to be loaded
    it has some method like back(). refresh(), forward(), to()

    Get() it will wait all the weblement page to be loaded
    it does not have any method

    7- difference driver.close and driver.quit()
    close ()---> it specifically closses the window that yoiu are currently working (where your driver is located)
    quit() --> it closes all the window

    8- What is the xpath and can you tell me aboiut the tyoe of xpath which one youo use in your project commonly

   xpath   is used to find the location of the element on the webpage by using HTML structure

   -->There are two type of xpath

   1- Absolute xpath : it goes from all the way from the parent to child step by step
   2- relative xpath it directly focuses on the child (location of the elment )

   in my project i used mostly relative xpath because it directly focuses on the child which i need to locate
   it is shorter than the absolute

   9- what is the difference between the relative and absolue xpath
   Absolute xpath : it goes from the parent to the child
                     it has one /
                     syntax is different
   Relative  xpath : it goes directly to the child
                     it has one //
                     syntax is different

   10 how do handle the static drop down menus
   --> in  my project i was handling the drop down different way
   * i would definetly check the tag of the location
   * if the locaation has a select tag i used select class (Select select = new Select (WEbelement))
    * if the location does not have select tag --> i used locators to locatote my element and i sendkey()
    * i can also use the action class to hoveOver my element (moveToElement )

11- what are the method of select

select class is very usefull (Must have Select Tag )for my project i can locate the element with this methods
 -selectByVisibleText
 -selectByIndex
 -SelectByValue

12- what kind of exception did you face in selenium?
*NoScuhElementException
*NullPointerException
*StaleElementReference Exception
*ElementIsNotInteractible
*Timeoutexcption
*nosuchFrameExcption
*nOSuchWindowException
*AlertUnhandeledException


13  what condition do you get staleElementException How do you handle it?

in ,u project i had a hard time stale element refrence exception to handle ?
* if the element is not in the DOM any more
* naviaget to another page and come back (element needs a little bit time to be loaded )
-->  i can handle this exception either putting some time to be apdated (Thred.sleep)
--> i reintilize my elemnt before i do my action class
---> you can also refresh the page

14- how do yoo handle alert
there are different type of alert i faced in my frame work
1- Operation System alert i can not handle it directly i need to use robot class
2- Html alert i just need to find the element and click on it
3- javaScript alert (pop-ups) i handle this alert with Alert class (RemoteAlertClass)
Alert alert= driver.switchTo().Alert();

15- for the alert interface what kind of the methods do you know

first of all alert is interface but the methods are coming from RemoteAlertClass
i think youo will checking me :)
we have 4 four methods of the AlertClass
Alert alert= driver.swithTo.alert()
alert.Accept()--> clicks ok button
alert.Dismiss()--> which clicks the CANCEL button
alert.GetText()--> which gets text from pop-up
alert.SendKeys()--> which send keys to pop-up

16- what do you know of the iframe can you tell me the text you used  before and how do you handle
the iframe in selenium

- here is the scenarion  we have a website i would like to get the text of the price
from the product  all xpath are correct and tell no problemm with attribure as well
there is no problemm with switching the window but i canot get the price of the product  what do you think the
reason could be?

the reason be the i frame os basicaly i would go to the website  and check the HTML
has an iframe tag or not by typing(// i frame or frame ) if thre is i frame on the HTML  i would difinitely check that
the element i am looking for is not under iframe
 I CAN DEAL WITH THE IFRAME ELEMENTS CBY SWITCHING MY DRIVER
 driver.swditch.frame()

 if you want i can give you more details abdout other methods like we have
 switch.driver.ParentFrame() --> which goes the parent iframe
  switch.driver.defaultContent--> which goes the main HTML

  17- what do you know about action class
   action class basically does the functionality of my mouse and keyborad i can say
   it is really useful in my project to handle some element soem of the imporatns methods of the action class
   MoveByOffSet(x,y)
   DoubleClicck()
   SendKeys
   contextClick()--> right click
   clickAndHold and release
   Drag and Drop
   MoveTOelement hoverOver
   click
   PERFORM   FOR EVERY METHODS

   Keyborad
   Keys.ENTER/RETURN
   Keys.ARROW-UP,ARROW-DOWN-ARROW-RIGHT,ARROW-LEFT

   18) what is the difference between find element and find Elements
   *  Find element : driver.findElement(By""):
        return the single WebElement
        once it fails it throw nosuchElement   exception

   * Find element : driver.findElement(By""):
      returns the list of the weblement
      once it fails it throws epmty list array

      19) what are the driver methods and weblement methods

     driver methods
     get
     naviagate
     gettitle
     findelements
     getcurenturl
     manage close
     quit
     Webelemnt methods
     sendKeys
     getText
     clear
     isDispaleyed isEnabled/Isselected
     submit
     getettribute
     .....

     What is the difference between check













































































     */


}
