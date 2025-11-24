# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.

Changes: 
mainscreen.html - line 14 - changed title to "CJ's Potato Chips"
mainscreen.html - line 18 - changed h1 to "CJ's Potato Chips"
mainscreen.html - line 21 changed h2 to "Single Bags"
mainscreen.html - line 53 - changed h2 to "box of bags"

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
about.html - line 1-15 - copied first 15 lines of mainscreen.html to about.html to match structure
about.html - line 14 - changed title to "about"
mainscreen.html - line 21 - added button for about page
MainScreenController.java - line 55-58 - added controller for about page
about.html - line 17 - added body section start
about.html - line 18 - added div section start
about.html - line 20 - added header 1
about.html - line 21 - added link to home page
about.html - line 23 - added hr
about.html - line 24 - added h2 for title of first section
about.html - line 25-31 - added paragraph for first section
about.html - line 32 - added hr
about.html - line 33 - added h2 for second section
about.html - line 34-36 - added paragraph for second section
about.html - line 37 - added hr
about.html - line 39 - added end of div
about.html - line 40 - added end of body
about.html - line 42 - added end of html

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

BootStrapData.java - line 27-33 - added repo for inhouse parts
BootStrapData.java - line 37-113 - added 5 new parts, 3 inhouse and 2 outsourced
BootStrapData.java - line 116-126 - added 5 new products to the repository

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
• The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.


G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.


H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.


I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.


J.  Remove the class files for any unused validators in order to clean your code.