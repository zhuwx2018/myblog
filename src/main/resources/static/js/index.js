var indexApp = new Vue({
    el:'#app',
    data:function(){
        return{
            menu:[]
        }
    },
    methods: {
        handleOpen:function(key, keyPath) {
            console.info(key,keyPath)
        },
        handleClose:function(key, keyPath) {

        }
    },
    mounted:function(){
        this.initData();
    },
    components:{
        "tree-menu":{
            template:"#myNav",
            name:"tree-menu",
            props:['children']
        }
    },
    methods:{
        initData:function () {
            var _this = this;
            this.$http.get("menu/init").then(function(res){
                console.info(res.data)
                _this.menu = res.data;
            });
        }
    }
});