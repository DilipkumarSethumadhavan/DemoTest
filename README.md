# UITestsBelong

***Please branch out from DEMO and start assignment***
Write feature file , step definitions and if possible pages for any of the below two requirements 

Site URL: http://automationpractice.com/

1.	While registering, if the email address is incorrect. User should see an error message - ***Done***
2.	Check whether Megamenu works (Dresses -> Summer dresses) -  ***Done***
3.	On the Summer dresses page. Click on Sort By: Price and validate whether the productgrid is arranged properly -  ***Not Completed***
4	Select a dress and change the color (Blue) and then add the item to cart, Validate	whether same product name, color and quantity are displayed in Cart Summary page. -  ***Done***


Once you finish assignment,
raise pull request to merge your changes to DEMO. 

# My Comments
1) Sorting is not working for the given site. This is not only for summer dress page but for all the pages. So I didn't code for 3 scenario.

2) Solution for scenario 3 - Using List of web elements, get the price for each product and validate price of first product is less than second product and proceed accordingly (This is for price low to high ) 

for(int i = 1 ; i <= size ;i++){
//*[@class = 'product_list grid row']//following::li[***i***]//following::p[1]/following::div[1]/span[1]
}

3) I have used used maven as build tool, use the following command to execute the framework **(compile test exec:java@generateCucumberReport -Dbrowser=chrome)**

4) I implemented scenario 2 using Robot class and mouse move. When you execute the framework please don't shake the mouse.

5) To see the results as cucumber reports use the following path - **DemoTest\target\cucumber-result-reports\cucumber-html-reports**
 

 

