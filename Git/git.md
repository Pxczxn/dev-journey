# 命令

| 命令                              | 说明                                       |
| --------------------------------- | ------------------------------------------ |
| `git add .`                       | 未追踪/更改的文件放置到暂存区              |
| `git commit -m '说明'`            | 暂存区的文件放置到本地仓库并添加“说明”信息 |
| `git push origin master`          | 将本地仓库推送到远程仓库                   |
| `git checkout -b 新分支名`        | 创建并切换到新分支（基于当前分支）         |
| `git branch 新分支名`             | 只创建分支（不切换）                       |
| `git checkout -b 新分支名 main`   | 基于 main 分支创建新分支                   |
| `git checkout -b 新分支名 pxczxn` | 基于 pxczxn 分支创建新分支                 |





# 前缀

| 前缀       | 说明                   | 示例                         |
| :--------- | :--------------------- | :--------------------------- |
| `feat`     | 新功能                 | `feat: 添加用户登录功能`     |
| `fix`      | Bug 修复               | `fix: 修复登录超时问题`      |
| `docs`     | 文档更新               | `docs: 更新README安装说明`   |
| `style`    | 代码格式（不影响功能） | `style: 调整代码缩进`        |
| `refactor` | 代码重构（不改功能）   | `refactor: 重构用户认证模块` |
| `perf`     | 性能优化               | `perf: 优化图片加载速度`     |
| `test`     | 添加或修改测试         | `test: 增加登录单元测试`     |
| `build`    | 构建系统或依赖变更     | `build: 升级webpack到5.0`    |
| `ci`       | CI/CD 配置变更         | `ci: 修改GitHub Actions配置` |
| `chore`    | 杂项（不修改src/test） | `chore: 更新.gitignore`      |
| `revert`   | 撤销之前的提交         | `revert: 回退feat登录功能`   |