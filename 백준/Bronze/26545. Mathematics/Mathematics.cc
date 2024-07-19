#include <iostream>
using namespace std;

int main()
{
	int k = 0;

	int a, b;

	cin >> a;

	for (int i = 0; i < a; i++)
	{
		cin >> b;

		k = k + b;
	}

	cout << k;
}