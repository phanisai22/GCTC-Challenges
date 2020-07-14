import itertools

def cal_batch(n):
    batch ,s, powr=0, 0, 1
    while n > s:
        s += 2**powr
        batch += 1
        powr += 1
    return batch

def cal_pos(batch, n):
    s = 0
    for i in range(1, batch):
        s += 2**i
    pos = n - s
    return pos

def cal_binary(batch, pos):
    all_comb = list(itertools.product([0, 1], repeat=batch))
    return all_comb[pos - 1]
    

if __name__ == "__main__":
    n = int(input())
    # n = 7
    batch = cal_batch(n)
    pos_in_batch = cal_pos(batch, n)
    res = cal_binary(batch, pos_in_batch)
    
    for i in range(batch):
        if res[i] == 1:
            print('4', end='')
        else:
            print('3', end='')
