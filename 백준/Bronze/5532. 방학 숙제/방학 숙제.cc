#include <iostream>
using namespace std;

int main() 
{
	int l, b, a, c, d;
	int s, k;

	cin >> l;
	cin >> a;
	cin >> b;
	cin >> c;
	cin >> d;

	s = a / c;
	k = b / d;

	if (a % c != 0)
		s = s + 1;

	if (b % d != 0)
		k = k + 1;

	if (s > k)
		cout << l - s;
	else if (s < k)
		cout << l - k;
	else
		cout << l - s;
}