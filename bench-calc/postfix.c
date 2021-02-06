#include "postfix.h"

// evaluate expression stored as an array of string tokens
double evaluate_postfix_expression(char ** args, int nargs) {
struct double_stack * stack_address = double_stack_new(nargs);
for(int i = 0; i < nargs; i++)
	{
		if((strcmp(args[i], "+")) == 0)
		{
			double first_value = double_stack_pop(stack_address);
			double second_value = double_stack_pop(stack_address);
			double_stack_push(stack_address, (first_value + second_value));
		}
		else if(strcmp(args[i], "-") == 0)
		{
			double first_value = double_stack_pop(stack_address);
			double second_value = double_stack_pop(stack_address);
			double_stack_push(stack_address, (second_value - first_value));
		}
		else if(strcmp(args[i], "x") == 0)
		{
			double first_value = double_stack_pop(stack_address);
			double second_value = double_stack_pop(stack_address);
			double_stack_push(stack_address, (first_value * second_value));
		}
		else if(strcmp(args[i], "X") == 0)
		{
			double first_value = double_stack_pop(stack_address);
			double second_value = double_stack_pop(stack_address);
			double_stack_push(stack_address, (first_value * second_value));
		}
		else if(strcmp(args[i], "/") == 0)
		{
			double first_value = double_stack_pop(stack_address);
			double second_value = double_stack_pop(stack_address);
			double_stack_push(stack_address, (second_value / first_value));
		}
		else if(strcmp(args[i], "^") == 0)
		{
			double first_value = double_stack_pop(stack_address);
			double second_value = double_stack_pop(stack_address);
			double result = pow(second_value, first_value);
			double_stack_push(stack_address, result);
		}
		else // value is a number
		{
			//printf("hello %s\n", parameters_array[i]);
			double_stack_push(stack_address, atof(args[i]));
		}
	}
	double final_result = double_stack_pop(stack_address);
	return final_result;
  // Write your code here
}
