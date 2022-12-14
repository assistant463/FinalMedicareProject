Feature: Buy medice from online MedicareApp

Scenario: A user should be able to meedice from the app successfully
Given a user is on a landing page
When login with normal user
And purchase the item
And login with admin user
And create the new product
And the product is visible in view section
And update quantity in basket and click refresh button
And add multiple products 
And validate the amount and grand total
Then when you purchase a product its quantity next time is reduced