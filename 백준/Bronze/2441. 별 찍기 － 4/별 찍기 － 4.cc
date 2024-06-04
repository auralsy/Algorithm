#include <iostream>
using namespace std;

int main()
{
	int n;
	cin >> n;

	for (int i = 0; i < n; i++) //줄반복
	{
		for (int j = 0; j < i; j++) //공백 반복
		{
			cout << " ";
		}
		
		for (int t = n - i; t > 0; t--) //별 반복(n-i개)
		{
			cout << "*";
		}

		cout << '\n';
	}
}