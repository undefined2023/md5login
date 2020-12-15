// json arrays as line data
var tableData = [

    {
        'filename': 'file20200530',
        'size': 125234532, // 125MB
        'update_date': '2020-05-30 22:15'
    },
    {
        'filename': 'file20200529',
        'size': 5353245234523,
        'update_date': '2020-05-29 22:15'
    },
    {
        'filename': 'file20200529',
        'size': 3253425342523452,
        'update_date': '2020-05-29 22:15'
    },
    {
        'filename': 'file20200529',
        'size': 2342314134,
        'update_date': '2020-05-29 22:15'
    },
    {
        'filename': 'file20200528',
        'size': 354352435,
        'update_date': '2020-05-28 22:15'
    },
    {
        'filename': 'file20200523',
        'size': 32534254325,
        'update_date': '2020-05-23 22:15'
    },
    {
        'filename': 'file20200523',
        'size': 645645643,
        'update_date': '2020-05-23 22:15'
    },
    {
        'filename': 'file20200521',
        'size': 6436346547,
        'update_date': '2020-05-21 22:15'
    },
    {
        'filename': 'file20200521',
        'size': 54362345432,
        'update_date': '2020-05-21 22:15'
    },
    {
        'filename': 'file20200521',
        'size': 23725345,
        'update_date': '2020-05-21 22:15'
    },
    {
        'filename': 'file20200521',
        'size': 26554267243265,
        'update_date': '2020-05-21 22:15'
    },
    {
        'filename': 'file20200521',
        'size': 234523453425234,
        'update_date': '2020-05-21 22:15'
    },
    {
        'filename': 'file20200521',
        'size': 15342435325,
        'update_date': '2020-05-21 22:15'
    },
    {
        'filename': 'file20200521',
        'size': 5234523452345,
        'update_date': '2020-05-21 22:15'
    },
    {
        'filename': 'file20200521',
        'size': 32464564326,
        'update_date': '2020-05-21 22:15'
    },
    {
        'filename': 'file20200521',
        'size': 6243624352325,
        'update_date': '2020-05-21 22:15'
    },
    {
        'filename': 'file20200521',
        'size': 523452345236,
        'update_date': '2020-05-21 22:15'
    },
    {
        'filename': 'file20200515',
        'size': 23452352346,
        'update_date': '2020-05-15 22:15'
    },
    {
        'filename': 'file20200515',
        'size': 237756757,
        'update_date': '2020-05-15 22:15'
    },
    {
        'filename': 'file20200513',
        'size': 9769786,
        'update_date': '2020-05-13 22:15'
    },
    {
        'filename': 'file20200507',
        'size': 579859675000,
        'update_date': '2020-05-07 22:15'
    },
    {
        'filename': 'file20200507',
        'size': 967583658,
        'update_date': '2020-05-07 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 6758604876,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 5686506875,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 68585604575,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 7056595658,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 67589050005876,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 650560758965965,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 568670885,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 56705795786,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 5678760705696706,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 567865006598678,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 5670658658,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 35757658,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 6785698758,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 65865899685,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 568567946045687,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 4856885686506,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 3568658358,
        'update_date': '2020-05-01 22:15'
    },
    {
        'filename': 'file20200301',
        'size': 37569606993900,
        'update_date': '2020-05-01 22:15'
    },

]


/*
	1 - Loop Through Array & Access each value
    2 - Create Table Rows & append to table
*/

// declare a javascript object
var state = {
    'querySet': tableData,
    'page': 1, // 加载页面后默认显示的页数
    'rows': 15,
    'window': 5, //  ?
}

$(document).ready(function(){
  $("#pagination-wrapper > button").click(function(){
    $(this).css("color", "red");
  });
});


buildTable() ////////////////////// 初始化，默认先显示第一页


function pagination(querySet, page, rows) {
    // 计算 分页信息

    var trimStart = (page - 1) * rows // 计算得出 当前页的第一条数据 的索引值
    var trimEnd = trimStart + rows

    var trimmedData = querySet.slice(trimStart, trimEnd) // 根据索引获取某个区间的数据

    var pages = Math.round(querySet.length / rows); // 总页数

    return {
        'querySet': trimmedData,
        'pages': pages,
    }

}

function pageButtons(pages) {
    // 根据 总页数 重新生成 分页按钮

    var wrapper = document.getElementById('pagination-wrapper')

    wrapper.innerHTML = ``
    console.log('Pages:', pages)

    var maxLeft = (state.page - Math.floor(state.window / 2))
    var maxRight = (state.page + Math.floor(state.window / 2))

    if (maxLeft < 1) {
        maxLeft = 1
        maxRight = state.window
    }

    if (maxRight > pages) {
        maxLeft = pages - (state.window - 1)

        if (maxLeft < 1) {
            maxLeft = 1
        }
        maxRight = pages
    }


    // add pagination buttons
    for (var page = maxLeft; page <= maxRight; page++) {
        wrapper.innerHTML += `<button value=${page} class="page btn btn-sm btn-info">${page}</button>` // style="color: white"
    }
    // 首页左边加“《”
    if (state.page != 1) {
        wrapper.innerHTML = `<button value=${1} class="page btn btn-sm btn-info">&#171; 首页</button>` + wrapper.innerHTML
    }
    // 尾页右边加“》”
    if (state.page != pages) {
        wrapper.innerHTML += `<button value=${pages} class="page btn btn-sm btn-info">尾页 &#187;</button>`
    }

    // 点击某一页的时候，替换数据行
    $('.page').on('click', function () {

        $('#table-body').empty()

        state.page = Number($(this).val())

        buildTable() // 每点击一次页数按钮，就重新刷新一次容器里的数据

        // 被点击按钮变略深色，其他按钮颜色变成默认颜色
        ///$(this).setAttribute('style', 'background-color: red;')
        // this.setAttribute('style', 'color: black;')


    })

}


function buildTable() {

    var table = $('#table-body') // 获取展示数据的容器

    var data = pagination(state.querySet, state.page, state.rows) // 准备 行数据 以及 分页信息

    var myList = data.querySet

    for (var i = 1 in myList) {

        var row = `<tr>
                  <td>${myList[i].filename}</td>
                  <td>${myList[i].size}</td>
                  <td>${myList[i].update_date}</td>
                  </tr>`

        table.append(row)

    }

    pageButtons(data.pages)

}

// https://www.youtube.com/watch?v=mslD-bpvjiU