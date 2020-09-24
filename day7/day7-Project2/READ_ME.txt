This is Project for the Customers which can get details and store them.

We can add, search, remove and list all customers.

EmpDao is  an interface located in com/hsbc/training/app/dao

Customer is an entity located in com/hsbc/training/app/entity

Two exceptions -  located in com/hsbc/training/app/exeption
1.CustNotFoundException - when the customer not found in the list
2.DuplicateException - When the existing customer is added.

Two implementations - List and Map located in com/hsbc/training/app/impl

Service funtion CustService used for above mentioned basic functions loacted in com/hsbc/training/app/services

Three Main Functions Main1 for List, Main2  for Map and Main3 or normal Check required to run project accordingly located in com/hsbc/training/app/main