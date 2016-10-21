#include <iostream>
// using namespace std; // to avoid std::cout everytime

int main(){
	int a=2;
	int b(3);
	std::string mystring = "This is a string";
	std::string mystring1 ("This is a string1");//this is another way to assign intial value

	// int c{5}; //this is another way to assign intial value
	a= a+5;
	std::cout << a-b << std::endl; //endl allows to print in a next line
	// cout << mystring << endl << + "-----------"+ mystring1; 
	return 0;
}