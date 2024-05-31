#include <iostream>
using namespace std;

int main()
{
	int arr[4][5];

	int arr1[5] = { 0 };
	int t, idx = 0;

	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			cin >> arr[j][i];
		}
		arr1[i] = arr[0][i] + arr[1][i] + arr[2][i] + arr[3][i];
	}

	t = arr1[0];
	for (int k = 1; k < 5; k++)
	{
		if (arr1[k] > t)
		{
			t = arr1[k];
			idx = k;
		}
			
	}

	cout << idx + 1 << ' ' << t;

}