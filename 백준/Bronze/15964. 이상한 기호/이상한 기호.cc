#include <iostream>
using namespace std;

int k(int a, int b)
{
	return (a + b) * (a - b);
}

int main()
{
	int a, b;
	cin >> a >> b;

	cout << k(a, b);
}