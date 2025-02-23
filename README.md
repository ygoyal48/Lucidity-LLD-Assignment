# Lucidity-LLD-Assignment

Hi team, I have designed this Delivery Optimizer System in Java which will tell the shortest route to the Delivery Partner(Aman in our case). Here is the file structure of the app - 

<img width="453" alt="Screenshot 2025-02-23 at 8 36 32 PM" src="https://github.com/user-attachments/assets/40ab9de6-2453-483b-aa5b-9e6bfd7b6965" />

I have used **Maven to import the dependencies** - 
1. JUIT
2. Lombok

Here is a quick View of all the files to save your time - 

IDistanceCalculator.java - 

<img width="983" alt="Screenshot 2025-02-23 at 8 42 20 PM" src="https://github.com/user-attachments/assets/9278b1c2-2d40-44fe-8737-446291b29466" />

HaversineCalculator.java - 

<img width="597" alt="Screenshot 2025-02-23 at 8 44 34 PM" src="https://github.com/user-attachments/assets/5d3f20c1-ea28-4c1e-bc9c-503aa25fded8" />

IFoodPreparationHub.java - 

<img width="633" alt="Screenshot 2025-02-23 at 8 44 54 PM" src="https://github.com/user-attachments/assets/b57c93ea-4d87-42ee-88a5-2d854a270fd7" />

Restaurant.java - 

<img width="890" alt="Screenshot 2025-02-23 at 8 45 02 PM" src="https://github.com/user-attachments/assets/f37b392a-9047-47d8-8945-f75199e65fd6" />

ILocationService.java - 

<img width="699" alt="Screenshot 2025-02-23 at 8 45 24 PM" src="https://github.com/user-attachments/assets/708f6fdd-6f38-4dc9-b7f0-d96bd7c179af" />

GeoLocation.java - 

<img width="742" alt="Screenshot 2025-02-23 at 8 45 15 PM" src="https://github.com/user-attachments/assets/987775ba-70b2-4e10-b51d-dd633924ad6d" />

OrderDetails.java - 

<img width="955" alt="Screenshot 2025-02-23 at 8 45 34 PM" src="https://github.com/user-attachments/assets/d1200b62-157e-4854-8dda-9dace5e4ddb4" />

IRouteOptimizer.java - 

<img width="876" alt="Screenshot 2025-02-23 at 8 46 18 PM" src="https://github.com/user-attachments/assets/41a787cb-a26a-4dca-99a3-6ac7ffc18203" />

DeliveryExecutive.java - 

<img width="1330" alt="Screenshot 2025-02-23 at 8 47 40 PM" src="https://github.com/user-attachments/assets/ee51281e-956f-40c0-ab74-2b3e370c12c8" />


I have **used JUIT to write the tests**. Here you can check the running status - 
<img width="1407" alt="Screenshot 2025-02-23 at 8 05 47 PM" src="https://github.com/user-attachments/assets/ea7a1822-e6b3-45f8-bcd9-598db1e85cff" />

Here is the code of tests for your quick reference - 

DeliveryExecutiveTest.java - 

<img width="1051" alt="Screenshot 2025-02-23 at 8 54 55 PM" src="https://github.com/user-attachments/assets/72204920-b6f2-4bc0-84e4-672072985416" />

GeoLocationTest.java - 

<img width="792" alt="Screenshot 2025-02-23 at 8 55 33 PM" src="https://github.com/user-attachments/assets/40987d6c-66cb-4877-be44-9acba02b2cc6" />

HaversineCalculatorTest.java - 

<img width="840" alt="Screenshot 2025-02-23 at 8 56 04 PM" src="https://github.com/user-attachments/assets/b5905f00-ae41-49d1-82c9-60ba080cb621" />

OrderTest.java - 

<img width="1252" alt="Screenshot 2025-02-23 at 8 56 39 PM" src="https://github.com/user-attachments/assets/933b880b-4f3f-403f-9d37-cc008540e766" />

RestaurantTest.java - 

<img width="1252" alt="Screenshot 2025-02-23 at 8 56 39 PM" src="https://github.com/user-attachments/assets/1a8ed91f-c252-4d98-b8fa-607c7a8aee98" />


To run the project - 
1. Download the Project
2. Import as Maven Project in any IDE
3. Sync the dependencies
4. Run the project

   
