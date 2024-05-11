const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm2aoe9/",
            name: "ssm2aoe9",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm2aoe9/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园服务平台小程序"
        } 
    }
}
export default base
