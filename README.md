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

mainscreen.html - line 86 - added line to create Buy Now button next to add/delete
BuyProductController.java - line 1-37 - created new controller for Buy Product button from mainscreen.html
confirmbuysuccess.html - line 1-12 - added code to display a success message when a purchase is successful
confirmbuyfailure.html - line 1-11 - added code to display a purchase failed message when a purchase cannot be completed


G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

Part.java - line 32-36 - added 2 variables, maxInv and minInv
Part.java - line 50, 51, 59, and 60 - added default values for maxInv and minInv
Part.Java - line 103-109 - added getter and setter methods for maxInv and minInv
InhousePart.java - line 18-19 - added values for minInv and maxInv
OutsourcedPart.java - line 18-19 - added values for minInv and maxInv
mainscreen.html - line 39-40 - added table headers for min and max inventory
mainscreen.html - line 49-50 - added table rows for min and max inventory
BootStrapData.java - line 45, 46, 59, 60, 73, 74, 93, 94, 110, 111 - added min and max inv to each part
InhousePartForm - line 24-28 - added entry fields for min and max inventory thresholds
OutsourcedPartForm - line 22-26 - added entry fields for min and max inventory thresholds
application.properties - line 6 - changed location of persistent database to "CJ-Chips.db"
Part.java - line 111-118 - added method to ensure inventory values are between min and max
PartServiceImpl.java - line 59 - added call to validateLimits method to save method
InhousePartServiceImpl - line 54 - added call to validateLimits method to save method
OutsourcedPartServiceImpl - line 52 - added call to validateLimits method to save method

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

ValidMinimum.java - line 1-17 - created new file with new error message for parts below minimum
MinimumValidator.java - line 1-24 - created new file to validate minimum parts threshold
Part.java - line 21 - added minimum validator
EnufPartsValidator.java - line 37-40 - added validation logic to check for min inventory
ValidMaximum.java - line 1-17 - created new file with new error message for above maximum
MaximumValidator.java - line 1-23 - created new file to validate maximum parts threshold
Part.java - line 23 - added maximum validator
OutsourcedPartForm.java - line 33-37 - added code to display error message in HTML form
InhousePartForm.java - line 32-36 - added code to display error message in HTML form

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

PartTest.java - line 159-194 - added 4 unit tests for getter and setter methods for min and max inv of parts class

J.  Remove the class files for any unused validators in order to clean your code.

- removed unused files, DeletePartValidator.java and ValidDeletePart.java

Fixes: OutsourcedPartForm.html - line 35 - fixed typo causing whitelabel error to occur when adding an item above or below max or min
Fixes: InhousePartForm.html - line 34 - fixed typo causing whitelabel error to occur when adding an item above or below max or min