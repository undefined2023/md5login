
// use js to send get request then retrieve jason data
// function httpGet(url)
// {
//     var xmlHttp = new XMLHttpRequest();
//     xmlHttp.open( "GET", url, false ); // false for synchronous request
//     xmlHttp.send( null );
//     return xmlHttp.responseText;
// }
//
// var tableData = httpGet("http://localhost:8080/get_all_file_info")

// var tableData = $.getJSON("http://localhost:8080/get_all_file_info",
//     function (data) {
//         console.log(data);
//     }
//     )


// var response = $.ajax({
//     dataType: "json",
//     url: "http://localhost:8080/get_all_file_info",
//     data: null,
//     success: console.log('success')
// });

// var tableData = null;
//
// $.getJSON('http://localhost:8080/get_all_file_info',
//     function (data) {
//         console.log("----start------");
//         console.log(data);
//         console.log('')
//         tableData = data;
//         console.log(data.toString());
//         $(data).each(function(i, item) {
//             console.log(item.size);
//         });
//     });





// var tableData = fetch('http://localhost:8080/get_all_file_info')
//     .then((response) => {
//         return response.json();
//     })
//     .then((myJson) => {
//         console.log(myJson);
//     });





// // json arrays as line data
// var tableData = [
//
//     {
//         'filename': 'file20200530',
//         'size': 125234532, // 125MB
//         'update_date': '2020-05-30 22:15'
//     },
//     {
//         'filename': 'file20200529',
//         'size': 5353245234523,
//         'update_date': '2020-05-29 22:15'
//     },
//     {
//         'filename': 'file20200529',
//         'size': 3253425342523452,
//         'update_date': '2020-05-29 22:15'
//     },
//     {
//         'filename': 'file20200529',
//         'size': 2342314134,
//         'update_date': '2020-05-29 22:15'
//     },
//     {
//         'filename': 'file20200528',
//         'size': 354352435,
//         'update_date': '2020-05-28 22:15'
//     },
//     {
//         'filename': 'file20200523',
//         'size': 32534254325,
//         'update_date': '2020-05-23 22:15'
//     },
//     {
//         'filename': 'file20200523',
//         'size': 645645643,
//         'update_date': '2020-05-23 22:15'
//     },
//     {
//         'filename': 'file20200521',
//         'size': 6436346547,
//         'update_date': '2020-05-21 22:15'
//     },
//     {
//         'filename': 'file20200521',
//         'size': 54362345432,
//         'update_date': '2020-05-21 22:15'
//     },
//     {
//         'filename': 'file20200521',
//         'size': 23725345,
//         'update_date': '2020-05-21 22:15'
//     },
//     {
//         'filename': 'file20200521',
//         'size': 26554267243265,
//         'update_date': '2020-05-21 22:15'
//     },
//     {
//         'filename': 'file20200521',
//         'size': 234523453425234,
//         'update_date': '2020-05-21 22:15'
//     },
//     {
//         'filename': 'file20200521',
//         'size': 15342435325,
//         'update_date': '2020-05-21 22:15'
//     },
//     {
//         'filename': 'file20200521',
//         'size': 5234523452345,
//         'update_date': '2020-05-21 22:15'
//     },
//     {
//         'filename': 'file20200521',
//         'size': 32464564326,
//         'update_date': '2020-05-21 22:15'
//     },
//     {
//         'filename': 'file20200521',
//         'size': 6243624352325,
//         'update_date': '2020-05-21 22:15'
//     },
//     {
//         'filename': 'file20200521',
//         'size': 523452345236,
//         'update_date': '2020-05-21 22:15'
//     },
//     {
//         'filename': 'file20200515',
//         'size': 23452352346,
//         'update_date': '2020-05-15 22:15'
//     },
//     {
//         'filename': 'file20200515',
//         'size': 237756757,
//         'update_date': '2020-05-15 22:15'
//     },
//     {
//         'filename': 'file20200513',
//         'size': 9769786,
//         'update_date': '2020-05-13 22:15'
//     },
//     {
//         'filename': 'file20200507',
//         'size': 579859675000,
//         'update_date': '2020-05-07 22:15'
//     },
//     {
//         'filename': 'file20200507',
//         'size': 967583658,
//         'update_date': '2020-05-07 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 6758604876,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 5686506875,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 68585604575,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 7056595658,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 67589050005876,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 650560758965965,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 568670885,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 56705795786,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 5678760705696706,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 567865006598678,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 5670658658,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 35757658,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 6785698758,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 65865899685,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 568567946045687,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 4856885686506,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 3568658358,
//         'update_date': '2020-05-01 22:15'
//     },
//     {
//         'filename': 'file20200301',
//         'size': 37569606993900,
//         'update_date': '2020-05-01 22:15'
//     },
//
// ]

/*
	1 - loop through json array and access each value
    2 - create table rows <tr> and append to table <table>
*/


$.getJSON('http://localhost:8080/get_all_file_info', function(data) {

    console.log(data)

    // 去除JSON中的第一个对象，因为储存的信息是username而不是fileinfo


    var state = {
        'querySet': data,
        'page': 1, // 加载页面后，默认显示的页号
        'rows': 7, // 每页显示的行数
        'window': 5, // 底下显示的页号按钮个数?
    }

    $(document).ready(function(){
        $("#pagination-wrapper > button").click(function(){
            $(this).css("color", "red");
        });
    });

    buildTable() // 初始化，默认先显示第一页

// 计算分页信息
    function pagination(querySet, page, rows) {

        var trimStart = (page - 1) * rows // 计算得出 当前页的第一条数据 的索引值
        var trimEnd = trimStart + rows

        var trimmedData = querySet.slice(trimStart, trimEnd) // 根据索引获取某个区间的数据

        var pages = Math.round(querySet.length / rows); // 总页数

        return {
            'querySet': trimmedData,
            'pages': pages,
        }

    }

// 根据总页数生成分页按钮
    function pageButtons(pages) {

        var wrapper = document.getElementById('pagination-wrapper') // 根据id获取到html页面的特定tag

        wrapper.innerHTML = ``

        // for (var page = 1; page <= pages; page ++) {
        //     wrapper.innerHTML += '<button value=${page} class="page btn btn-sm btn-info">${page}</button>'
        // }

        console.log('Pages:', pages)

        var maxLeft = (state.page - Math.floor(state.window / 2))
        var maxRight = (state.page + Math.floor(state.window / 2))

        if (maxLeft < 1) {
            maxLeft = 1
            maxRight = state.window
        }

        if (maxRight > pages) {
            maxLeft = pages - (state.window - 1)

            maxRight = pages

            if (maxLeft < 1) {
                maxLeft = 1
            }
        }

        // add pagination buttons
        for (var page = maxLeft; page <= maxRight; page++) {
            wrapper.innerHTML += `<button value=${page} class="page btn btn-sm btn-info" style="background-color: #0c4d89; border-color: white">${page}</button>` // style="color: white"
        }
        // 首页左边加“《”
        if (state.page != 1) {
            wrapper.innerHTML = `<button value=${1} class="page btn btn-sm btn-info" style="background-color: #0c4d89; border-color:white">&#171; 首页</button>` + wrapper.innerHTML
        }
        // 尾页右边加“》”
        if (state.page != pages) {
            wrapper.innerHTML += `<button value=${pages} class="page btn btn-sm btn-info" style="background-color: #0c4d89; border-color:white">尾页 &#187;</button>`
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

        var i = 1
        for (i in myList) {

            var row = `<tr>
                  <td>${myList[i].name}</td>
                  <td>${myList[i].size}</td>
                  <td>${myList[i].upload_date}</td>
                  </tr>`

            table.append(row)

        }

        pageButtons(data.pages)

    }
});




// https://www.youtube.com/watch?v=mslD-bpvjiU