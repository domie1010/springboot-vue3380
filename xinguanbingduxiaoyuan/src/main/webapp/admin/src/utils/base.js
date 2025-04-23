const base = {
    get() {
        return {
            url : "http://localhost:8080/xinguanbingduxiaoyuan/",
            name: "xinguanbingduxiaoyuan",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xinguanbingduxiaoyuan/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "新冠病毒校园监控平台"
        } 
    }
}
export default base
