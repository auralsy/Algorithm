#include <iostream>
using namespace std;

int main()
{
	int a, b, c;

	cin >> a >> b >> c;

	int k;

	if (a > b)
	{
		if (a > c)
		{
			if (b > c)
				cout << c << ' ' << b << ' ' << a;
			else if (b < c)
				cout << b << ' ' << c << ' ' << a;
		}
		else if (a < c)
			cout << b << ' ' << a << ' ' << c;

	}
	else if (a < b)
	{
		if (b > c)
		{
			if (a > c)
				cout << c << ' ' << a << ' ' << b;
			else if (a < c)
				cout << a << ' ' << c << ' ' << b;
		}
		else if (b < c)
			cout << a << ' ' << b << ' ' << c;
	}
}