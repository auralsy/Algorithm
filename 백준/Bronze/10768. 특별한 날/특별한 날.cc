#include <iostream>
using namespace std;

int main()
{
	int m, d;

	cin >> m;
	cin >> d;

	if (m > 2)
	{
		cout << "After";
	}
	else if (m < 2)
	{
		cout << "Before";
	}
	else if (m == 2)
	{
		if (d > 18)
			cout << "After";
		else if (d < 18)
			cout << "Before";
		else
			cout << "Special";
	}
}