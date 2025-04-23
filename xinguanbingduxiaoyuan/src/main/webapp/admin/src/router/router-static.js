import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import forum from '@/views/modules/forum/list'
    import hejianzhaungtai from '@/views/modules/hejianzhaungtai/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import news from '@/views/modules/news/list'
    import xueshengqingjia from '@/views/modules/xueshengqingjia/list'
    import xueshengtiwen from '@/views/modules/xueshengtiwen/list'
    import yimiaojiezhong from '@/views/modules/yimiaojiezhong/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryBanji from '@/views/modules/dictionaryBanji/list'
    import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
    import dictionaryHejianzhaungtai from '@/views/modules/dictionaryHejianzhaungtai/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryXueshengqingjia from '@/views/modules/dictionaryXueshengqingjia/list'
    import dictionaryXueshengqingjiaYesno from '@/views/modules/dictionaryXueshengqingjiaYesno/list'
    import dictionaryXueshengtiwen from '@/views/modules/dictionaryXueshengtiwen/list'
    import dictionaryYimiaojiezhong from '@/views/modules/dictionaryYimiaojiezhong/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryBanji',
        name: '班级',
        component: dictionaryBanji
    }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryHejianzhaungtai',
        name: '检测状态',
        component: dictionaryHejianzhaungtai
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryXueshengqingjia',
        name: '请假类型',
        component: dictionaryXueshengqingjia
    }
    ,{
        path: '/dictionaryXueshengqingjiaYesno',
        name: '审核结果',
        component: dictionaryXueshengqingjiaYesno
    }
    ,{
        path: '/dictionaryXueshengtiwen',
        name: '时间类型',
        component: dictionaryXueshengtiwen
    }
    ,{
        path: '/dictionaryYimiaojiezhong',
        name: '接种状态',
        component: dictionaryYimiaojiezhong
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/forum',
        name: '论坛信息',
        component: forum
      }
    ,{
        path: '/hejianzhaungtai',
        name: '核酸检测情况',
        component: hejianzhaungtai
      }
    ,{
        path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
    ,{
        path: '/news',
        name: '公告资讯',
        component: news
      }
    ,{
        path: '/xueshengqingjia',
        name: '学生请假',
        component: xueshengqingjia
      }
    ,{
        path: '/xueshengtiwen',
        name: '学生体温',
        component: xueshengtiwen
      }
    ,{
        path: '/yimiaojiezhong',
        name: '疫苗接种情况',
        component: yimiaojiezhong
      }
    ,{
        path: '/yonghu',
        name: '学生',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
