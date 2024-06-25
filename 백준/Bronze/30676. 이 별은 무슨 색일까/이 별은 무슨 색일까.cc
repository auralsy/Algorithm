#include <iostream>
using namespace std;

int main()
{
	int k;

	cin >> k;

	if (k >= 620 && k <= 780)
		cout << "Red";
	else if (k >= 590 && k < 620)
		cout << "Orange";
	else if (k >= 570 && k < 590)
		cout << "Yellow";
	else if (k >= 495 && k < 570)
		cout << "Green";
	else if (k >= 450 && k < 495)
		cout << "Blue";
	else if (k >= 425 && k < 450)
		cout << "Indigo";
	else
		cout << "Violet";
}