### 常用命令
|    命令   |	描述		|
|:-----------------|:--------------------:|
| git clone [url]|将远程仓库的代码克隆到当前目录|
|||
| git init|初始化仓库|
|||
|git status|查看状态|
|||
|git add [file]|将file文件的修改添加到缓存|
|git add .|将所有文件的修改添加到缓存|
|||
|git commit -m 'xxx'|提交|
|git commit - - amend|撤销提交（两个 - 之间没有空格）|
|||
|git log|查看提交历史|
|git reflog|查看命令历史|
|||
|git brach|查看分支列表
|git branch a|从当前分支另外再新建一个分支
|git branch -d| 删除分支
|git branch -D| 强制删除分支
|||
|git checkout a|切换到a分支
|git checkout -b a|新建并切换（git branch a   +   git checkout a）
|||
|git checkout v1.0|切换到v1.0标签
|git checkout - - filename|误删的情况下返回源文件（两个 - 之间没有空格）
|||
|git stash|将当前的修改暂存起来 （git add 过的也可以）
|git stash list |查看缓存列表
|git stash apply|恢复暂存
|git stash drop |删除暂存
|git stash pop |恢复并删除（git stash apply  +  git stash drop）
|||
|git merge develop |将develop 分支合并到当前分支
|git tag v1.0| 将当前分支新建一个标签