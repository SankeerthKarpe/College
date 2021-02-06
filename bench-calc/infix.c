#include "infix.h"

// evaluate expression stored as an array of string tokens
double evaluate_infix_expression(char ** args, int nargs) {
    char * output_string[nargs];
    int output_index = 0;
    int stack_size = 0;
    struct double_stack * stack_address = double_stack_new(nargs);
    for(int i = 0; i < nargs; i++)
    {
        //printf("%s\n", parameters_array[i]);
        if (strcmp(args[i], "^") == 0)
        {
//            printf("push on stack %s\n", parameters_array[i]);
            double_stack_push(stack_address, i);
            stack_size++;
        }
        else if ( (strcmp(args[i], "x") == 0) || (strcmp(args[i], "X") == 0) || (strcmp(args[i], "/") == 0) )
        {
            while ( ((strcmp(args[(int)(stack_address->items[(stack_address->top)-1])], "^") == 0)) || ((strcmp(args[(int)(stack_address->items[(stack_address->top)-1])], "X") == 0)) || ((strcmp(args[(int)(stack_address->items[(stack_address->top)-1])], "/") == 0)) )
            {
                double value = double_stack_pop(stack_address);
                // printf("pop on stack %s\n", parameters_array[(int)value]);
                output_string[output_index] = args[(int)value];
                output_index++;
                stack_size--;
            }
          //  printf("push on stack %s\n", parameters_array[i]);
            double_stack_push(stack_address, i);
            stack_size++;
        }
        else if ( (strcmp(args[i], "+") == 0) || (strcmp(args[i], "-") == 0) )
        {
            while (( (strcmp(args[(int)(stack_address->items[(stack_address->top)-1])], "x") == 0) || (strcmp(args[(int)(stack_address->items[(stack_address->top)-1])], "X") == 0) || (strcmp(args[(int)(stack_address->items[(stack_address->top)-1])], "/") == 0) || (strcmp(args[(int)(stack_address->items[(stack_address->top)-1])], "^") == 0) || (strcmp(args[(int)(stack_address->items[(stack_address->top)-1])], "+") == 0)) || (strcmp(args[(int)(stack_address->items[(stack_address->top)-1])], "-") == 0))
            {

                double value = double_stack_pop(stack_address);
                // printf("pop on stack %s\n", parameters_array[(int)value]);
                output_string[output_index] = args[(int)value];
                output_index++;
                stack_size--;
            }
          //  printf("push on stack %s\n", parameters_array[i]);
            double_stack_push(stack_address, i);
            stack_size++;
        }
        else if (strcmp(args[i], "(" ) == 0)
        {
//            printf("push on stack %s\n", parameters_array[i]);
            double_stack_push(stack_address, i);
            stack_size++;
        }
        else if (strcmp(args[i], ")") == 0)
        {
            while(strcmp(args[(int)(stack_address->items[(stack_address->top)-1])], "(") != 0)
            {
                double value = double_stack_pop(stack_address);
//                printf("hello, number %s\n", parameters_array[(int)value]);
                output_string[output_index] = args[(int)value];
                output_index++;
                stack_size--;
            }
            double value = double_stack_pop(stack_address); // pop left bracket
	    printf("%f\n", value);
//            printf("pop on stack %s\n", parameters_array[(int)value]);
            stack_size--;
        }
        else // must be number
        {
//            printf("hello, number %s\n", parameters_array[i]);
            output_string[output_index] = args[i];
            output_index++;
        }
    }

    // Pop remaining stack items off
    for (int i = stack_size; i > 0; i--)
    {
        double value = double_stack_pop(stack_address);
//        printf("pop on stack %s\n", parameters_array[(int)value]);
        output_string[output_index] = args[(int)value];
        output_index++;
    }
/*
    printf("final sentence \n");
    for (int i = 0; i < output_index; i++)
    {
        printf("%s\n", output_string[i]);
    }
*/
    double result = evaluate_postfix_expression(output_string, output_index);
    return result;

  // Write your code here
}
