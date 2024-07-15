#include <iostream>
using namespace std;

int main()
{
	int n;
	int a = 0;
	int b = 0;
	int c = 0;

	cin >> n;

	for (int i = 1; i <= n; i++)
	{
		a = a + i;
	}

	b = a * a;

	for (int i = 1; i <= n; i++)
	{
		c = c + i * i * i;
	}

	cout << a << '\n';
	cout << b << '\n';
	cout << c << '\n';
}