	#define _CRT_SECURE_NO_WARNINGS
	#include <stdio.h>
	int main(void) {
		double N[1000] = { 0 };//과목 방
		int V;//과목 수
		double max = 0;
		double sum = 0 ;

		scanf("%d", &V);//과목 개수 받기

		for (int i = 0; i < V; i++) {
			scanf("%lf", &N[i]);// 과목 점수 입력
		}
		max = N[0];

		for (int i = 0; i < V; i++) {

			if (N[i] > max) {
				max = N[i];
			}
		}
	
		//printf("%lf\n", max);

		for (int i = 0; i < V; i++) {
			sum += (N[i] / max) * 100;
		}

		sum = sum / V;

		printf("%lf", sum);


	}