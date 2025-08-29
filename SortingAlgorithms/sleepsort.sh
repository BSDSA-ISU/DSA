#!/bin/bash
for n in "$@"; do
  (sleep "$n"; echo "$n") &
done
wait

# Run it as ./sleepsort.sh 3 2 4 7 8