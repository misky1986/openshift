#!/bin/bash

if [ "`git remote| grep all`" == "all" ] ; then
    git remote remove all
fi

for r in `git remote`
do
    git config --add remote.all.url `git config remote.$r.url`
done