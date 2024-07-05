#include <iostream>
using namespace std;

int main()
{
	double w, h;

	cin >> w;
	cin >> h;

	double bmi = w / (h * h);

	if (bmi >= 25)
		cout << "Overweight";
	else if (bmi >= 18.5 && bmi < 25)
		cout << "Normal weight";
	else
		cout << "Underweight";
}