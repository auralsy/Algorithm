#include <iostream>
using namespace std;

int main()
{
	double a, b;

	cin >> a >> b;

	double k;
	k = a - (a*b/100);

	if (k >= 100)
		cout << 0;
	else
		cout << 1;
}