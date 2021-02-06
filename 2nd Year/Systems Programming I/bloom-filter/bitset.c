#include "bitset.h"

#include <math.h>
#include <stdio.h>
#include <stdlib.h>


// create a new, empty bit vector set with a universe of 'size' items
struct bitset * bitset_new(int size) {
   	struct bitset * result;
	result = calloc(1, sizeof(struct bitset));
	result->size_in_words = ceil(size/64);
	result->universe_size = size;

	//allocate memory for bits array
	result->bits = calloc(result->size_in_words, sizeof(uint64_t));
	return result;

}

// get the size of the universe of items that could be stored in the set
int bitset_size(struct bitset * this) {
return this->universe_size;
}

// get the number of items that are stored in the set
int bitset_cardinality(struct bitset *this)
{
    int count_of_items = 0;

    for (int i = 0; i < this->size_in_words; i++)
    {
        int spot_in_word = i % 64;
        uint64_t which_word = this->bits[i];
        uint64_t mask = 1 << spot_in_word;
        while (which_word != 0)
        {
            uint64_t is_there_items = mask & which_word;
            if (is_there_items != 0)
            {
                count_of_items++;
            }
            which_word = which_word >> 1;
        }
    }
    return count_of_items;
}

// check to see if an item is in the set
int bitset_lookup(struct bitset * this, int item){
	//unsigned int u_item = item;
	uint64_t which_word = this->bits[(int) floor(item/64)];
	uint64_t mask = 1;
	mask = mask << (int) floor(item%(64));
	uint64_t is_there_item = mask & which_word;
	if(is_there_item != 0)
{
		return 1;	// returns true
	}
	return 0;	//returns false
}

// add an item, with number 'item' to the set
// has no effect if the item is already in the set
void bitset_add(struct bitset * this, int item) {
	//unsigned int u_item = (int) floor (item%64);
	uint64_t which_word = this->bits[(int) floor(item/64)];
	//printf("%lx ", which_word);
	uint64_t mask = 1;
	mask = mask << (int) floor(item%(64));
	uint64_t is_there_item = mask & which_word;
	if(is_there_item != 0) // does not need to be added
	{
		return;
	}
	else // no item there so must be added
	{
		uint64_t added_item = mask | which_word;
		//printf("%lx\n", added_item);
		this->bits[(int) floor(item/64)] = added_item;
		return;
	}
	printf("Error in bitset_add() \n");
}

// remove an item with number 'item' from the set
void bitset_remove(struct bitset * this, int item) {
	int word = item / 64;
	item = item - (word * 64);
	uint64_t mask = 1;
	mask = mask<<item;
	mask = ~mask;
	this->bits[word] = this->bits[word] & mask;
}

// place the union of src1 and src2 into dest;
// all of src1, src2, and dest must have the same size universe
void bitset_union(struct bitset * dest, struct bitset * src1, struct bitset * src2) {
	if((bitset_size(dest) == bitset_size(src1))&& (bitset_size(src1) == bitset_size(src2)))
	{
		for(int i = 0; i < (src1->size_in_words); i++)
		{
			dest->bits[i] = src1->bits[i] | src2->bits[i];
		}
	}
	else
	{
		printf("bitset_union failure: sets not the same size\n");
	}
	return;
}

// place the intersection of src1 and src2 into dest
// all of src1, src2, and dest must have the same size universe
void bitset_intersect(struct bitset * dest, struct bitset * src1, struct bitset * src2){
	if((bitset_size(dest) == bitset_size(src1)) && (bitset_size(src1) == bitset_size(src2)))
	{
		for(int i = 0; i < (src1->size_in_words); i++)
		{
			dest->bits[i] = src1->bits[i] & src2->bits[i];
		}
	}
	else
	{
		printf("bitset_interset failure: sets not the same size");
	}
	return;
}
